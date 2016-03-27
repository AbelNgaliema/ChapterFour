package za.ac.cput.chapter41.PLKCorrectionTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.chapter41.PLKCorrection.Rectangle;

/**
 * Created by Abel on 2016-03-27.
 */
public class plkCorrectionTest extends TestCase {

    Rectangle rectangle = new Rectangle(100.00, 100.00);
    //  rectangle.setWidth(100.00);



    @Test
    public void testWidth()
    {

        assertEquals(100.00, rectangle.getWidth(rectangle));
    }


    @Test
    public void testHeight()
    {

        assertEquals(100.00, rectangle.getHeight(rectangle));
    }





    @Test

    public void testAreaSquare()
    {
        assertEquals(10000.00, rectangle.area(rectangle));
    }
}
