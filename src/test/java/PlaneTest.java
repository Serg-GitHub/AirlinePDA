import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;



    @Before
    public void setUp(){
        plane = new Plane(250, 10.000);

    }

    @Test
    public void hasCapacity(){
        assertEquals(250, plane.getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(10.000, plane.getWeight(),0);
    }









}
