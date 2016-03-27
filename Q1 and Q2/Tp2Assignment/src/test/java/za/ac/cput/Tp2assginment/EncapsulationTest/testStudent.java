package za.ac.cput.Tp2assginment.EncapsulationTest;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;
import za.ac.cput.Tp2assginment.Encapsulation.Student;

/**
 * Created by Abel on 2016-03-24.
 */
public class testStudent extends TestCase {

   Student student = new Student("213094444","Abel","Ngaliema");



    @Test
    public void testStudentNum()
    {
        assertEquals("213094444", student.getStudent_number());
    }
    @Test
    public void testName()
    {
        assertEquals("Abel", student.getName());
    }
    @Test
    public void testSurname()
    {
        assertEquals("Ngaliema", student.getSurname());
    }


}
