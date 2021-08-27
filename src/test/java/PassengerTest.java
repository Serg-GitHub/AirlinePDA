import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;


    @Before
    public void before() {
        passenger1 = new Passenger("John Harper", 21, 2);
        passenger2 = new Passenger("Juan Mata Ruiz", 21, 3);
        passenger3 = new Passenger("Zsolt Podoba-Szalai", 21, 2);
        passenger4 = new Passenger("Sky Su", 21, 4);

    }
    @Test
    public void passengerHasName(){
        assertEquals("John Harper", passenger1.getName());
        assertEquals("Juan Mata Ruiz", passenger2.getName());
        assertEquals("Zsolt Podoba-Szalai", passenger3.getName());
        assertEquals("Sky Su", passenger4.getName());
    }
}
