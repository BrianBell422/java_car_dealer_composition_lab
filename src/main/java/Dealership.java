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

    public double getTill() {
        return till;
    }

    public void addToStockList(Vehicle vehicle) {
        stocklist.add(vehicle);
    }

    public void removeFromStockList(Vehicle vehicle) {
        stocklist.remove(vehicle);
    }

    public void buyCar(Vehicle car) {
        if(this.getTill() > car.getPrice()){
            this.addToStockList(car);
            this.till = this.getTill() - car.getPrice();
        }
    }

    public void addToTill(Vehicle vehicle){
        this.till = this.getTill() + vehicle.getPrice();
    }

    public void sellCar(Vehicle vehicle, Customer customer) {
        customer.buyCar(vehicle);
        this.removeFromStockList(vehicle);
        this.addToTill(vehicle);
    }
}
