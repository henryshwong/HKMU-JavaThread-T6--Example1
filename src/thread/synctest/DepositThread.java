package thread.synctest;

import thread.synctest.BankAccount;

public class DepositThread extends Thread{
    private final BankAccount bankAccount;

    public DepositThread(BankAccount bankAccount,ThreadGroup tg, String gName){
        super(tg,gName);
        // add ThreadGroup and thread name to this thread.

        this.bankAccount = bankAccount;
    }

    public void run(){


//        synchronized (bankAccount){
//            bankAccount.deposit(1);
//        }

        // Try without synchronized
         bankAccount.deposit(1);
    }
}
