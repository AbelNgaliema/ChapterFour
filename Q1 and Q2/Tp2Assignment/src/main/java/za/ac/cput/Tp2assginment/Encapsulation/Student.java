package za.ac.cput.Tp2assginment.Encapsulation;

/**
 * Created by Abel on 2016-03-24.
 */
public class Student  {

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    private  String student_number;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    private  String name;
    private String surname;

    public Student()
    {

    }
    public Student(String stdn, String name, String surname)
    {
        this.name  = name;
        this.student_number = stdn;
        this.surname = surname;
    }


}
