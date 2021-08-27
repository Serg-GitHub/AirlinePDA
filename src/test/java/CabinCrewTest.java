import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;

    @Before
    public void setUp(){
        cabinCrew1 = new CabinCrew("Sergio", "Captain");
        cabinCrew2 = new CabinCrew("Simon", "Co Pilot");
        cabinCrew3 = new CabinCrew("Jakub", "First Officer");




    }

    @Test
    public void hasName(){
        assertEquals("Sergio",cabinCrew1.getName());
        assertEquals("Simon",cabinCrew2.getName());
        assertEquals("Jakub",cabinCrew3.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", cabinCrew1.getRank());
        assertEquals("Co Pilot", cabinCrew2.getRank());
        assertEquals("First Officer", cabinCrew3.getRank());

    }
}
