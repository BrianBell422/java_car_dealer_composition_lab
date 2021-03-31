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

    public double getMoney() {
        return money;
    }

    public void addCarToCollection(Vehicle vehicle) {
        this.ownedVehicles.add(vehicle);
    }

    public void buyCar(Vehicle car) {
         if(this.getMoney() > car.getPrice()){
             this.addCarToCollection(car);
             this.money = this.getMoney() - car.getPrice();
         }
    }

}
