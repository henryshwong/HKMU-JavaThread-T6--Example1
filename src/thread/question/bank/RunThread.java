package thread.question.bank;

public class RunThread {

    public static void main(String[] args) {
        Acount acount ;
        acount = new Acount();
        DepositThread depositthead = new DepositThread(acount);
        WithDrawThread withdrawtheard = new WithDrawThread(acount);

      depositthead.start();
      withdrawtheard.start();

      for (int x=1;x<=1000;x++){

      }

        System.out.println("account " + acount.getBalance());
    }


}
