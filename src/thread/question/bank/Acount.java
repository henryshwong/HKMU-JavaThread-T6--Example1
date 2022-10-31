package thread.question.bank;

public class Acount {
    private int balance ;
    public Acount(){
        this.balance=0;
    }

    public void deposit(int amt){
        balance += amt;
    }

    public void widthDraw(int amt){
        balance -= amt;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
}
