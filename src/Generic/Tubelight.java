package Generic;

public class Tubelight {
    int itemNo;
    int watt;

    public Tubelight(int itemNo, int watt) {
        this.itemNo = itemNo;
        this.watt = watt;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }
}
