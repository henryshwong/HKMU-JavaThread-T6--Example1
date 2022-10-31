package thread.question.bankAnswer;

// answer 1. Account object.
public class Account {
    private int balance;

    public Account(){
        balance=0;
    }

    public void deposit(int amt){
        balance+=amt;
    }

    public void withDraw(int amt){
        balance -= amt;
    }

    public int getBalance() {
        return balance;
    }
}
