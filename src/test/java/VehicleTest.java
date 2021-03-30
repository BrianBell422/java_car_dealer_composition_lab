import org.junit.Before;
import org.junit.Test;
import vehicle.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VehicleTest {

    Vehicle vehicle;
    Tyres tyres;
    Engine engine;

    @Before
    public void before() {
        tyres = new Tyres("Racing", 20);
        engine = new Engine("Petrol", 200);
        vehicle = new Vehicle(VehicleType.DIESEL, BodyType.JEEP, tyres, engine, 15000.00, "black");
    }
    
    @Test
    public void vehicleHasType(){
        assertEquals(VehicleType.DIESEL, vehicle.getVehicleType());
    }

    @Test
    public void vehicleHasBodyType(){
        assertEquals(BodyType.JEEP, vehicle.getBodyType());
    }

    @Test
    public void vehicleHasTyres() {
        assertNotNull(vehicle.getTyres());
    }
    
    @Test
    public void vehicleHasEngine() {
        assertNotNull(vehicle.getEngine());
    }

    @Test
    public void vehicleHasPrice() {
        assertEquals(15000, vehicle.getPrice(),0.0);
    }

    @Test
    public void vehicleHasColour() {
        assertEquals("black", vehicle.getColour());
    }

}
