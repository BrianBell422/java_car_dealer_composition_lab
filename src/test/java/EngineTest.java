import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;
    Engine engine1;
    Engine engine2;

    @Before
    public void before() {
        engine = new Engine("Petrol", 150);
        engine1 = new Engine("Diesel", 200);
        engine2 = new Engine("LPG", 90);
    }

    @Test
    public void engineHasFuel() {
        assertEquals("Petrol", engine.getFuel());
    }

    @Test
    public void engineHasPower() {
        assertEquals(200, engine1.getPower());
    }
}
