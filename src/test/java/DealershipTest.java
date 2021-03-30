import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Vehicle> stocklist;

    @Before
    public void before() {
        stocklist = new ArrayList<Vehicle>();
        dealership = new Dealership(stocklist, 50000.00);
    }

    @Test
    public void dealershipStartsWithNoCars() {
        assertEquals(0, dealership.getStocklist().size());
    }

    @Test
    public void dealershipHasTill() {
        assertEquals(50000.00, dealership.getTill(), 0.0);
    }

}
