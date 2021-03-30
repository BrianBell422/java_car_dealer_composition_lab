package vehicle;

import behaviours.ITyres;

public class Tyres implements ITyres {

    private String tread;
    private int size;

    public Tyres(String tread, int size) {
        this.tread = tread;
        this.size = size;
    }

    public String getTread() {
        return tread;
    }

    public void setTread(String tread) {
        this.tread = tread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
