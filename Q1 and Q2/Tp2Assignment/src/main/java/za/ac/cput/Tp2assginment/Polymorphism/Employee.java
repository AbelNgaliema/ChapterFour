package za.ac.cput.Tp2assginment.Polymorphism;

/**
 * Created by Abel on 2016-03-24.
 */
public class Employee extends Person {


    public String getEmployeeNum() {
        return employeeNum;
    }

    public String getPosition() {
        return position;
    }



    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    private String employeeNum;
    private String position;

    public Employee()
    {

    }
    public Employee(String name, String surname, int age, String employeeNum, String position)
    {
        super(name,surname,age);
        this.employeeNum = employeeNum;
        this.position = position;
    }
}
