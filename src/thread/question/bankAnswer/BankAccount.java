package thread.question.bankAnswer;

/*
 練習的建議答案.
 */

public class BankAccount {

    public static void main(String[] args) {
        Account account = new Account();

        Thread depositThread = new DepositThread(account);
        Thread withDrawThread = new WithDrawThread(account);

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
