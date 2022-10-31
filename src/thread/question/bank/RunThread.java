package thread.question.bank;

public class RunThread {

    private static void main(String[] args){
        Acount acount ;
        acount = new Acount();
        Thread depositthead = new DepositThread(acount);
        Thread withdrawtheard = new WithDrawThread(acount);

        depositthead.start();
        withdrawtheard.start();
    }
}
