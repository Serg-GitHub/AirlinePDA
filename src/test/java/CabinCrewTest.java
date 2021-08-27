import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Sergio", "Captain");

    }

    @Test
    public void hasName(){
        assertEquals("Sergio",cabinCrew.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", cabinCrew.getRank());
    }
}
