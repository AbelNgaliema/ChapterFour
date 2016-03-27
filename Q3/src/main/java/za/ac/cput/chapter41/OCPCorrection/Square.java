package za.ac.cput.chapter41.OCPCorrection;

/**
 * Created by Abel on 2016-03-27.
 */
public class Square extends Shape {
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area() {
        return this.length * this.length;
    }
}
