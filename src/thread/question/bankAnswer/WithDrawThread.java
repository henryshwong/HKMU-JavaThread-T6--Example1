package thread.question.bankAnswer;

public class WithDrawThread extends Thread{
    private Account account;
    private final int TIMES=10000;

    public WithDrawThread(Account account){
        this.account = account;
    }

    public void run() {

        // without syncbock
        // account.withDraw(1);
    /*
        // synchronized method
        // question 2
        for(int x=1; x<=TIMES; x++){
            synchronized (account){
                account.withDraw(1);
                System.out.print("W");
            }
        }
    */


        // by wait and notifyAll method
        // question 3
        for (int x = 1; x <= TIMES; x++) {
            synchronized (account){

                while (account.getBalance() <= 0){
                    try {
                        // 這是最新Java要求的用法. 考試時, 直接寫wait()就可以
                        account.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                account.withDraw(1);

                // 這是最新Java要求的用法. 考試時, 直接寫notifyAll()就可以
                account.notifyAll();
            }
        }

    }

}
