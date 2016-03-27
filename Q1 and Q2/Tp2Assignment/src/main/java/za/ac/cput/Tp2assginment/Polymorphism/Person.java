package za.ac.cput.Tp2assginment.Polymorphism;

/**
 * Created by Abel on 2016-03-24.
 */
public class Person {

    private  String name;
    private String surname;
    private int age;

    public Person()
    {

    }
    public Person(String name,String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name =  name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public  int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
