import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Pilot pilot;



    @Before
    public void setUp(){
        plane = new Plane(250,10.000,PlaneType.BOEING767);
        flight = new Flight(plane, "BBDFJ6", "BGI", "11:55", "EDI",pilot);


    }

    @Test
    public void hasPlane(){
        assertEquals(PlaneType.BOEING767,plane.getType());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("BBDFJ6",flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("BGI", flight.getDestination());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("11:55", flight.getDepartureTime());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

}