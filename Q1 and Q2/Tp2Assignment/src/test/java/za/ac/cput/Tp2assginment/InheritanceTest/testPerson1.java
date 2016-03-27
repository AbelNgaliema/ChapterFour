package za.ac.cput.Tp2assginment.InheritanceTest;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Tp2assginment.Inheritance.Person1;

/**
 * Created by Abel on 2016-03-24.
 */
public class testPerson1 extends TestCase {

    Person1 person = new Person1("Abel", "Ngaliema", 21);

    @Test
    public void testName()
    {
        assertEquals("Abel", person.getName());
    }
    @Test
    public void testSurname()
    {
        assertEquals("Ngaliema", person.getSurname());
    }
    @Test
    public void testAge()
    {
        assertEquals(21,person.getAge() );
    }
}
