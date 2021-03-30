import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stocklist;
    private Double till;

    public Dealership(ArrayList<Vehicle> stocklist, Double till) {
        this.stocklist = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getStocklist() {
        return stocklist;
    }

    public Double getTill() {
        return till;
    }
}
