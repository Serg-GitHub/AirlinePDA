import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Sergio", "Captain", "CCE50");
    }

    @Test
    public void hasName() {
        assertEquals("Sergio", pilot.getName());
    }
    @Test
    public void hasRank() {
        assertEquals("Captain", pilot.getRank());
    }
    @Test
    public void hasPilotLicenseNumber(){
        assertEquals("CCE50", pilot.getPilotLicenseNumber());
    }

}
