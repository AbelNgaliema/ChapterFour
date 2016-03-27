package za.ac.cput.chapter41.OCPViolationTest;

import junit.framework.TestCase;
import org.junit.Test;

import za.ac.cput.chapter41.OCPViolation.Area;
import za.ac.cput.chapter41.OCPViolation.Rectangle;

/**
 * Created by Abel on 2016-03-27.
 */
public class ocpViolationTest extends TestCase {
    Rectangle rectangle = new Rectangle();
    //  rectangle.setWidth(100.00);

    za.ac.cput.chapter41.OCPViolation.Square square = new za.ac.cput.chapter41.OCPViolation.Square();

    Area area = new Area();

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
    public void testLength(){

        square.setLength(120.00);
        assertEquals(120.00, square.getLength());
    }

    @Test
    public void testAreaRectangle()
    {

        rectangle.setHeight(5.00);
        rectangle.setWidth(5.00);


        assertEquals(25.00, area.area(rectangle));
    }
    @Test

    public void testAreaSquare()
    {
        square.setLength(5.00);
        assertEquals(25.00, area.area(square));
    }




}
