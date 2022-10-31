package defineclass;

public class Notebook extends Computer {
    private int weight;
    private int battery;

    public int getWeight() { return weight; }
    public int getBattery() { return battery; }
    public void setWeight(int w) { weight=w; }
    public void setBattery(int b) { battery=b; }

    @Override
    public int expectedLife() {
        return 3;
    }
}