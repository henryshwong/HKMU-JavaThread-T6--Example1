package thread;

import java.util.ArrayList;

// put buffer thread
class PutBuffer extends Thread {
  private Buffer buffer;

  public PutBuffer(Buffer buffer){
    this.buffer = buffer;
  }

  public void run(){
    for (int x =1; x<=10;x++ ){
      try {

        // because put method use wait, it need a try block
        buffer.put(x);
        System.out.print("p:"+x+" ");

      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

// get buffer thread
class GetBuffer extends Thread {
  private Buffer buffer;

  public GetBuffer(Buffer buffer){
    this.buffer = buffer;
  }

  public void run(){
    try {
      // because get method use wait, it needs a try block
      System.out.print("g:" + buffer.get() +" ");

    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

public class Buffer {

  // array use as a buffer

  private ArrayList<Integer> elem = new ArrayList<>();


  public synchronized void put(int i) throws InterruptedException {

    // thread.Buffer size = 10, wait, until the get method remove an item from buffer
    while (elem.size()==10) {
      System.out.print("Full ");
      wait();
    }
    elem.add(i);   // add number to array
    notifyAll();   // tell all threads "waiting" threads, they can run again
  }
  public synchronized int get() throws InterruptedException {
    while (elem.size()==0) {
      System.out.print("Empty ");
      wait();         // wait for other thread's notifyAll signal.
    }
    int max=0;
    for (int i=1;i<elem.size();i++) {
      if (elem.get(max)<elem.get(i)) {
        max=i;
      }
    }
    int re = elem.get(max);
    elem.remove(max);   // remove an item from array

    notifyAll();
    return re;      // return the max number found.
  }

// buffer test
//
  public static void main(String[] args) {
  Buffer buffer = new Buffer();
    final int TEST_BUFFER = 10;

    for(int x=0; x<=TEST_BUFFER; x++){
      PutBuffer putBuffer = new PutBuffer(buffer);
      putBuffer.setPriority(Thread.MIN_PRIORITY);
      putBuffer.start();

      GetBuffer getBuffer = new GetBuffer(buffer);
      getBuffer.setPriority(Thread.MAX_PRIORITY);
      getBuffer.start();
    }


 }

} // end of class
