package test.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ZeBr on 19.03.2018.
 */
public class PointTests {

    @Test
    public void testDistance () {
        Point p1 = new Point(5, 15);
        Point p2 = new Point(-3, 2);
        Assert.assertEquals(GeometryUtils.distance(p1, p2), 15.264337522473747);
    }
}
