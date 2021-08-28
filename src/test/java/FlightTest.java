import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(250,10.000,PlaneType.BOEING767);
//        flightNumber = new flightNumber()
    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING767,plane.getType());
    }
//    @Test
//    public void hasFlight



}