import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    CabinCrewType cabinCrewType;



    @Before
    public void setUp(){
        plane = new Plane(2500);

    }

    @Test
    public void hasCapacity(){
        assertEquals(2500, plane.getCapacity());
    }







}
