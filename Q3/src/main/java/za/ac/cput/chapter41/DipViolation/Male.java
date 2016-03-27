package za.ac.cput.chapter41.DipViolation;

/**
 * Created by Abel on 2016-03-25.
 */
public class Male {

    public void setName(String name) {
        this.name = name;
    }
    public Male()
    {

    }

    public Male(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getGender() {
        return  "Male";

    }

    String name;
}
