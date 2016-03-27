package za.ac.cput.chapter41.SRPViolationTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.chapter41.SRPViolation.Rectangle;
import za.ac.cput.chapter41.SRPViolation.Square;

/**
 * Created by Abel on 2016-03-27.
 */
public class srpViolationTest extends TestCase {

    Rectangle rectangle = new Rectangle();
    Square square = new Square();

    @Test
    public void testWidth()
    {
        rectangle.setWidth(100.00);

        assertEquals(100.00, rectangle.getWidth());
    }


    @Test
    public void testHeight()
    {
        rectangle.setHeight(100.00);
        assertEquals(100.00, rectangle.getHeight());
    }

    @Test

    public void testRectangleArea()
    {
        rectangle.setHeight(100.00);
        rectangle.setWidth(100.00);

        assertEquals(10000.00, rectangle.area());
    }

    @Test
    public void testLength(){

        square.setLength(120.00);
        assertEquals(120.00, square.getLength());
    }
    @Test

    public void testSquareArea()
    {
        square.setLength(6.00);
        assertEquals(36.00, square.area());
    }
}