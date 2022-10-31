package thread.question.bank;

public class WithDrawThread {
    private Acount acount;
    public WithDrawThread(Acount acount){
        this.acount = acount;
    }
    public void run() {
        synchronized (acount) {
            acount.widthDraw(1);
        }
    }
}
