package thread;

// examples of thread syntax

class ThreadTest extends Thread{
// 用 extends thread 方式.
    // 要傳入的 argument, 用private 在thread class中定義.
    private int arg;

    public ThreadTest(){}   // 建立空白的Constructor

    // 在class constructor 中傳入 arg
    public ThreadTest(int arg){
        this.arg = arg;    // 將傳入的arg 放入這個class的 private arg中
    }

    // 利用setter傳入arg
    // Thread 的setter 定義方式和一般有些不同. 需要加入 Thread class 和 return this;  一般的class不需要.
    public ThreadTest setArg(int arg) {
        this.arg = arg;
        return this;
    }


    // ** Thread 要 run的程序都在這個 run method內. 每個thread都需要一個run method
    public void run(){
        arg=1;      // 在這裏就可以使用傳入的arg

/*
        // 在run內使用的其他Thread method.
        // object 是需要保護的shared resources, 這sync{} block內的程序, 每次只可以有一個thread 執行.
        // Assume (假設) arg is an Object
        synchronized (Object arg){
            arg.add(1);
            arg.temp += 1;
        }

        wait()   //  這個 thread 停止, 等待 notifyAll 的信號.
        notifyAll()  // 發出可以運行的信號給其他 threads

        // 等待1s  (1000ms = 1s).  凡是用等待都需要加try 來 catch 一個 InterruptedExcption, 因爲可以利用
        // Thread.interrupted() 發出 Interrupt 信號來 wake up 這個thread, 然後繼續運行 try block後的程序.
        try {
            sleep(1000)
        } catch (InterruptedException e) {
            System.out.print("Wake up");
        }
*/
    }
}

// 用 Runnable 來建立Thread的方式
// class 的內容寫法完全一樣. 只是用了 implements Runnable 來定義.
class RunnableTest implements Runnable{
    // 要傳入的 argument, 用private 在thread class中定義.
    private int arg;

    public RunnableTest(){};

    // 在class contractor 中傳入 arg
    public RunnableTest(int arg){
        this.arg = arg;    // 將傳入的arg 放入這個class的 private arg中
    }

    // 另一個方法傳入 arg, 利用setter.
    public RunnableTest setArg(int arg) {
        this.arg = arg;
        return this;
    }

    // Thread 要 run的程序都在這個 run method內. 每個thread都需要一個run method
    public void run(){
        arg=1;      // 在這裏就可以使用傳入的arg
    }
}

// 每個 java file只可以由一個主要的class, 這是public class開頭的.
// 需要在同一個 java file建立其他class, 需要寫在這個主要class的上面.
public class Syntax {

    // 記住 psvm = public static void main. 而帶入的 arguments 一定是 String[] array.
    // 這裏是java的程序開始運行的地方.
    public static void main(String[] args) {

        // arg的取用方法. 例如題目要求傳入2個 file name. 可以直接寫
        if (args.length > 0){
            String file1 = args[0];   // 取第一個傳入的參數. 或在程序中直接使用arg[0取用.
            String file2 = args[1];   // 取第二個傳入的參數. 或在程序中直接使用arg[1].
        }


        // 使用 extends Thread 建立的 class 的使用方式.
        Thread t = new ThreadTest(1);  // 如果constructor 中有arg,在這裏放入.
        Thread t1 = new ThreadTest().setArg(1);  // 利用Thread的setter來出入, 也需要在new的時候同時傳入.

        // 設定 thread的優先級別. 利用 Thread.MIN_PRIORITY, Thread.NORMAL_PRIORITY, Thread.MAX_PRIORITY
        //     or number 1,5,10.   10是最高.  在start thread 前設定
        t.setPriority(Thread.MIN_PRIORITY);

        // run thread
        t.start();
        t1.start();

        // 使用 Runnable 建立的 thread 的使用方法.
        // 使用時. 在Java的Thread傳入 Runnable的 class就可以. 其他使用方法一樣.
        Thread r = new Thread(new RunnableTest(1));
        Thread r1 = new Thread(new RunnableTest().setArg(1));

        r.start();
        r1.start();

    }
}
