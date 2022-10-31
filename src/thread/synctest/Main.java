package thread.synctest;

import thread.synctest.BankAccount;

/*
  看看用 synchronense 的效果. 在DepositThread 如果沒有用 synchronized 保護 bankAccount,
  運行10000次後, bankAccount 將有可能不=10000
 */

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        // use Thread Group to get activeCount()
        ThreadGroup tg = new ThreadGroup("g");


        int times = 10000;
        for(int x = 1; x<=times; x++){
            new DepositThread(bankAccount, tg, Integer.toString(x)).start();
        }

        // wait for all thread end
        while (tg.activeCount()>0){
//            System.out.print( tg.activeCount());
        }

        System.out.println("Balance " + bankAccount.getBalance());

    }
}