import behaviours.IEngines;
import behaviours.ITyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.BodyType;
import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Vehicle> ownedVehicles;
    Vehicle car;
    ITyres tyres;
    IEngines engine;

    @Before
    public void before() {
        ownedVehicles = new ArrayList<Vehicle>();
        customer = new Customer(ownedVehicles, 15000.00);
        car = new Vehicle(VehicleType.ELECTRIC, BodyType.HATCHBACK,tyres, engine, 10000.00, "Pink");
    }

    @Test
    public void customerStartsWithNoCars() {
        assertEquals(0, customer.getOwnedVehicles().size());
    }

    @Test
    public void customerHasMoney() {
        assertEquals(15000, customer.getMoney(), 0.0);
    }

    @Test
    public void canAddCarToCollection() {
        customer.addCarToCollection(car);
        assertEquals(1, customer.getOwnedVehicles().size());
    }

    @Test
    public void  canBuyVehicle() {
        customer.buyCar(car);
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(5000.00, customer.getMoney(), 0.0);
    }

}

