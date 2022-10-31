package defineclass;

// Desktop 繼承 Computer
public class Desktop extends Computer {
    private int monitorSize;

    public void setMonitorSize(int m) {
        monitorSize=m;
    }
    public int getMonitorSize() {
        return monitorSize;
    }

    @Override
    public int expectedLife() {
        return 5;
    }
}