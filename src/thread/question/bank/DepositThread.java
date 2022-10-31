package thread.question.bank;

public class DepositThread {
    private Acount acount;

    public DepositThread(Acount acount){
        this.acount = acount;
    }

    public void run(){
        synchronized (acount){
            acount.deposit(1);
        }
    }


}
