package thread.synctest;

public class BankAccount {
    private int balance;

    public BankAccount(){
        balance=0;
    }

    public void deposit(int amt){
        balance += amt;
    }

    public int getBalance(){
        return balance;
    }
}
