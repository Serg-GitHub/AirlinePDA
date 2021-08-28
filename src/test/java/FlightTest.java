import org.junit.Before;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;

    @Before
    public void setUp(){
        plane = new Plane(250,10.000,PlaneType.BOEING767);
        flight = new Flight(plane, "CCDNJ6", "Barbados", "11:55" );


    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING767,plane.getType());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("CCDNJ6",flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Barbados", flight.getDestination());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("11:55", flight.getDepartureTime());
    }
}