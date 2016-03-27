package za.ac.cput.chapter41.DipViolation;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Abel on 2016-03-25.
 */
public class dipViolationTest extends TestCase {


    Male male = new Male("Tabogo");
    Female female = new Female("Mabogo");

    @Test
    public void testMaleName()
    {
        assertEquals("Tabogo", male.getName());
    }
    @Test
    public void testFemaleName()
    {
        assertEquals("Mabogo",female.getName());
    }
    @Test
    public void testGender()
    {
        assertEquals("Female", female.getGender());
        assertEquals("Male", male.getGender());
    }
}
