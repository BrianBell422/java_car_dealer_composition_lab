import behaviours.ITyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Vehicle> stocklist;
    Vehicle vehicle;
    Engine engine;
    Tyres tyres;
    Customer customer;
    ArrayList<Vehicle> ownedVehicles;

    @Before
    public void before() {
        tyres  = new Tyres("Racing", 20);
        engine = new Engine("Diesel", 200);
        vehicle = new Vehicle(VehicleType.DIESEL, BodyType.JEEP, tyres, engine, 10000.00, "black");
        stocklist = new ArrayList<Vehicle>();
        dealership = new Dealership(stocklist, 50000.00);
        ownedVehicles = new ArrayList<Vehicle>();
        customer = new Customer(ownedVehicles, 15000.00);
    }

    @Test
    public void dealershipStartsWithNoCars() {
        assertEquals(0, dealership.getStocklist().size());
    }

    @Test
    public void dealershipHasTill() {
        assertEquals(50000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void addVehicleToStockList() {
        dealership.addToStockList(vehicle);
        assertEquals(1, dealership.getStocklist().size());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyCar(vehicle);
        assertEquals(1, dealership.getStocklist().size());
        assertEquals(40000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void canRemoveCarFromStockList() {
        dealership.addToStockList(vehicle);
        dealership.removeFromStockList(vehicle);
        assertEquals(0, dealership.getStocklist().size());
    }

    @Test
        public void canSellToCustomer() {
        dealership.addToStockList(vehicle);
        dealership.addToStockList(vehicle);
        dealership.sellCar(vehicle, customer);
        assertEquals(60000.00, dealership.getTill(), 0.0);
        assertEquals(5000.00, customer.getMoney(), 0.0);
        assertEquals(1, dealership.getStocklist().size());
        assertEquals(1, customer.getOwnedVehicles().size());
    }


}
