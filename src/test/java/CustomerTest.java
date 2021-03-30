import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ArrayList<Vehicle> ownedVehicles;

    @Before
    public void before() {
        ownedVehicles = new ArrayList<Vehicle>();
        customer = new Customer(ownedVehicles, 10000.00);
    }

    @Test
    public void customerStartsWithNoCars() {
        assertEquals(0, customer.getOwnedVehicles().size());
    }

    @Test
    public void customerHasMoney() {
        assertEquals(10000, customer.getMoney(), 0.0);
    }

}

