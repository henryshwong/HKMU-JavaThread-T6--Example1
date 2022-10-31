package thread.question.bankAnswer;

public class DepositThread extends Thread {
    private Account account;
    private final int TIMES = 10000;

    public DepositThread(Account account) {
        this.account = account;
    }

    public void run() {

        // without sync block
        // account.deposit(1);

/*
        // use synchronized method
        // question 2
        for(int x=1; x<=TIMES; x++){
            synchronized (account){
                account.deposit(1);
                System.out.print("D");
            }
        }
*/

        // use wait and notifyAll method
        // balance limit (限制 10元)
        // question 3
        for (int x = 1; x<=TIMES; x++){

            synchronized (account) {

                while (account.getBalance() >= 10) {

                    try {
                        // 這是最新Java要求的用法. 考試時, 直接寫wait()就可以
                        account.wait();
                    } catch (InterruptedException e) {

                    }
                }

                account.deposit(1);

                // 這是最新Java要求的用法. 考試時, 直接寫notifyAll()就可以
                account.notifyAll();
            }

        }

    }
}
