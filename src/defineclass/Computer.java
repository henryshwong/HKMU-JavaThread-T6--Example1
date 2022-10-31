package defineclass;

// abstract class example
//
abstract public class Computer {
    private int memory;    // memory size
    private int price;     // price
    private int clockSpeed; // cpu speed

    private String staffId;  // staff id

    // 繼承的class可以使用的methods. (public)
    public int getMemory() { return memory; }
    public int getPrice() { return price; }
    public int getClockSpeed() { return clockSpeed; }
    public String getStaffId() { return staffId; }
    public void setMemory(int m) { memory=m; }
    public void setPrice(int p) { price=p; }
    public void setClockSpeed(int c) { clockSpeed=c; }
    public void setStaffId(String s) { staffId=s; }

    // 繼承的class需要override的method
    abstract public int expectedLife();

    public int depreciation(int y) {
        return y*price/expectedLife();
    }
}
