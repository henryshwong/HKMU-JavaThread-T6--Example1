package thread.question.bank;

public class DepositThread extends Thread{
    private Acount acount;

    public DepositThread(Acount acount){
        this.acount = acount;
    }

    public void run(){

        for (int x=1;x<=10000;x++){
            synchronized (acount){
                while (acount.getBalance() >=10){
                    try {
                        acount.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                acount.deposit(1);
                acount.notifyAll();
            }

        }




        synchronized (acount){
            acount.deposit(1);
        }
    }


}
