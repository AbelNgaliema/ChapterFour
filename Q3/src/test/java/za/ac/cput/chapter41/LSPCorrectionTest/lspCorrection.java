package za.ac.cput.chapter41.LSPCorrectionTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.chapter41.LSPCorrection.Circle;
import za.ac.cput.chapter41.LSPCorrection.Rectangle;

/**
 * Created by Abel on 2016-03-27.
 */
public class lspCorrection extends TestCase {

    Circle circle = new Circle(12.00);
    Rectangle rectangle = new Rectangle(100.00,120.00);

    @Test

    public void testDiameter()
    {

        assertEquals(12.00, circle.getDiameter());
    }
    @Test
    public void testWidth()
    {
        assertEquals(100.00, rectangle.getWidth());
    }
    @Test
    public void testHeight()
    {
        assertEquals(120.00, rectangle.getHeight());
    }
    @Test
    public void testRadius()
    {
        assertEquals(6.00, circle.radius());
    }

    @Test
    public void testCircleArea()
    {
        assertEquals(113.04, circle.area());
    }
    @Test
    public void testRectangle()
    {
        assertEquals(12000.00, rectangle.area());
    }
}
