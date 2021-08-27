import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    CabinCrewType cabinCrewType;



    @Before
    public void setUp(){
        plane = new Plane(50);

    }

    @Test
    public void hasCapacity(){
        assertEquals(50, plane.getCapacity());
    }







}
