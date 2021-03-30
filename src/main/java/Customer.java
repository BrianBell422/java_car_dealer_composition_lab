import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Vehicle> ownedVehicles;
    private Double money;

    public Customer(ArrayList<Vehicle> ownedVehicles, Double money) {
        this.ownedVehicles = new ArrayList<>();
        this.money = money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public Double getMoney() {
        return money;
    }
}
