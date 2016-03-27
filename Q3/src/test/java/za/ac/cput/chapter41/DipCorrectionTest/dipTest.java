package za.ac.cput.chapter41.DipCorrectionTest;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.chapter41.DipCorrection.Female;
import za.ac.cput.chapter41.DipCorrection.Male;

/**
 * Created by Abel on 2016-03-25.
 */
public class dipTest extends TestCase {

    Male male = new Male("Abel");
    Female female = new Female("Lerissa");

    @Test
    public void testMaleName()
    {
        assertEquals("Abel", male.getName());
    }
    @Test
    public void testFemaleName()
    {
        assertEquals("Lerissa",female.getName());
    }
    @Test
    public void testGender()
    {
        assertEquals("Female", female.getGender());
        assertEquals("Male", male.getGender());
    }
}
