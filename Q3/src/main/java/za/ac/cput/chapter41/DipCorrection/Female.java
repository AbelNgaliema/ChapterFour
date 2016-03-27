package za.ac.cput.chapter41.DipCorrection;

import java.beans.FeatureDescriptor;

/**
 * Created by Abel on 2016-03-25.
 */
public class Female extends Gender {

    @Override
    public String getGender()
    {
        return "Female";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Female()
    {

    }
    public Female(String name)
    {
        this.name = name;
    }

}
