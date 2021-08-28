import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;
    Pilot pilot;
    Passenger passenger;


    @Before
    public void setUp(){
        pilot = new Pilot("Sergio", "Captain", "CCE50");
        plane = new Plane(250,10.000,PlaneType.BOEING767);
        flight = new Flight(plane, "BBDFJ6", "BGI", "11:55", "EDI", pilot);
        passenger = new Passenger("John Harper", 21, 2);

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
        System.out.println(pilot);
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }

    @Test
    public void getCapacity(){
        assertEquals(PlaneType.BOEING767.getCapacity(), 250);
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Good morning everyone! Wishing you all a very pleasant flight from EDI to BGI today", pilot.pilotCanFlyPlane(flight));

    }



}