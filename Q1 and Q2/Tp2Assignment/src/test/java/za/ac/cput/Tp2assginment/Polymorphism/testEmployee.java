package za.ac.cput.Tp2assginment.Polymorphism;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Abel on 2016-03-24.
 */
public class testEmployee extends TestCase {

    Employee employee = new Employee("Abel","Ngaliema",21,"r22werttt","Software Developers");

    @Test

    public void testName()
    {
        assertEquals("Abel",employee.getName());
    }
    @Test
    public void testSurname()
    {
        assertEquals("Ngaliema",employee.getSurname());
    }
    @Test
    public void testAge()
    {
        assertEquals(21,employee.getAge());
    }
    @Test
    public  void testEmNum()
    {
        assertEquals("r22werttt",employee.getEmployeeNum());
    }
    @Test
    public void testPositon()
    {
        assertEquals("Software Developers",employee.getPosition());
    }

}
