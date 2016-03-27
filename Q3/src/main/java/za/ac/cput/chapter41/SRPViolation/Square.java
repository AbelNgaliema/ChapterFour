package za.ac.cput.chapter41.SRPViolation;

/**
 * Created by Abel on 2016-03-27.
 */
public class Square extends Rectangle {

    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area(){

        return length * length;
    }
}
