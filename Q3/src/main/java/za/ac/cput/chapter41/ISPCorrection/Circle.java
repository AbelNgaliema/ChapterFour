package za.ac.cput.chapter41.ISPCorrection;

/**
 * Created by Abel on 2016-03-26.
 */
public class Circle implements Area, Radius{

    private final double pi = 3.14;
    private double diameter;

    public Circle() {
    }

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

 //   @Override
    public double area(){
        double radius = diameter / 2;
        return pi * (radius * radius);
    }

//    @Override
    public double radius(){
        return diameter / 2;
    }
}

