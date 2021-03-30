import org.junit.Before;
import org.junit.Test;
import vehicle.Tyres;

import static org.junit.Assert.assertEquals;


public class TyresTest {

    Tyres tyres;
    Tyres tyres1;
    Tyres tyres2;
    Tyres tyres3;

    @Before
    public void before() {
        tyres = new Tyres("Racing", 21);
        tyres1 = new Tyres("Summer", 17);
        tyres2 = new Tyres("Winter", 21);
        tyres3 = new Tyres("Hybrid", 19);
    }

    @Test
    public void tyreHasTreadType() {
        assertEquals("Summer", tyres1.getTread());
    }

    @Test
    public void tyreHasSize() {
        assertEquals(21, tyres.getSize());
    }


}
