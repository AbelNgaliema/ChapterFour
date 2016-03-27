package za.ac.cput.Tp2assginment;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Abel on 2016-03-06.
 */
public class myClass {

    String name;
    double  salary;
    Set<myClass> objcts = new HashSet<myClass>();
    int age;

    public myClass(String name,double sal,int age)
    {
        this.name = name;
        this.salary = sal;
        this.age = age;
    }

    public myClass()
    {}
    public void setName(String name)
    {
       this.name = name;
    }

    public  void setSalary(double sal)
    {
        this.salary = sal;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
         return this.age;
    }

    public  double getSalary()
    {
        return this.salary;
    }
    public void setObjcts(myClass c1, myClass c2, myClass c3)
    {
        objcts.add(c1);
        objcts.add(c2);
        objcts.add(c3);
    }
    public Set<myClass> getObjcts(){return objcts;}
}
