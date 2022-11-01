package thread.question.bank;

public class WithDrawThread extends Thread{
    private Acount acount;
    public WithDrawThread(Acount acount){
        this.acount = acount;
    }
    public void run() {

        for (int x = 0; x<10000; x++){
            synchronized (acount) {

                while (acount.getBalance() <= 0){
                    try {
                        acount.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                acount.widthDraw(1);
                acount.notifyAll();
            }
        }



    }
}
