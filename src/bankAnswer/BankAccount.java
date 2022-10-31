package bankAnswer;

/*
 練習的建議答案.
 */

import java.util.ArrayList;

public class BankAccount {

    public static void main(String[] args) {
        Account account = new Account();

        DepositThread depositThread = new DepositThread(account);
        WithDrawThread withDrawThread = new WithDrawThread(account);

        depositThread.start();
        withDrawThread.start();

        // join() will wait for the thread end
        try {
            depositThread.setName("Deposit");
            withDrawThread.setName("WithDraw");
            depositThread.join();
            withDrawThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" ");
        System.out.println("Balance " + account.getBalance());
    }

}
