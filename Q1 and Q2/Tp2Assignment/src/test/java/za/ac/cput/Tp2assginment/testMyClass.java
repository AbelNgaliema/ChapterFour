package za.ac.cput.Tp2assginment;

import junit.framework.TestCase;


/**
 * Created by Abel on 2016-03-06.
 */
public class testMyClass extends TestCase
{
    myClass object1 = new myClass("Abel",12300.00,20);

    myClass object2 = null;
    myClass object4 = new myClass("Kevin",12400.11,25);
    myClass object5 = new myClass("Keren",12400.10,21);
    myClass object6 = new myClass("Tresor",12500.10,21);
    myClass testObject = new myClass();


    public void testName()
    {
        assertEquals("Kevin",object4.getName());
        assertNotSame("Abel",object4.getName());
    }
    public void testAge()
    {
        assertEquals(20, object1.getAge());
        assertNotSame(26, object4.getAge());
    }

    public  void testdouble()
    {
       assertEquals(12400.11,object4.getSalary());
        assertNotSame(123333.00, object4.getSalary());
    }
    public void testObjectNullness()
    {
        assertNull(object2);
        assertNotNull(object1);
    }
    public void testObjectEquality()
    {
        myClass testObejtec = object1;
        assertNotSame(object1, object4);
        assertEquals(object1, testObejtec);
    }

    public void testList()
    {
       testObject.setObjcts(object1, object4,object5);

        assertEquals(true, testObject.getObjcts().contains(object1));
        assertEquals(false, testObject.getObjcts().contains(object6));
    }







}
