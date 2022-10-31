import java.io.DataInputStream;
import java.io.FileInputStream;

// T6 Example 1

public class Multiples5 extends Thread{
  static private int notFinished;
  static private int noMultiples=0;
  private String fileName;

  synchronized void finished(int no) {
    notFinished--;
    noMultiples+=no;
    if (notFinished==0) {
      System.out.println("The total number of multiples of 5 in the files is "+ noMultiples);
    };
  }

  public Multiples5(String f) {
    fileName=f;
  }
  @Override
  public void run() {
    int m5=0;
    try {
      DataInputStream input=new DataInputStream(new FileInputStream(fileName));
      while (true) {
        int no=input.readInt();
        if (no%5==0) {
          m5++;
        }
      }
    } catch (Exception e) {
      finished(m5);
    }
  }
  public static void main(String st[]) {
    notFinished = st.length;
    noMultiples=0;
    for (int i=0;i<st.length;i++) {
      Multiples5 multi5 = new Multiples5(st[i]);
      multi5.start();
    }
  }
}