package za.ac.cput.chapter41.PLKCorrection;

/**
 * Created by Abel on 2016-03-27.
 */
public abstract class Shape {

    public double getWidth(Rectangle rectangle) {
        return rectangle.getWidth(rectangle);
    }

    public void setWidth(Rectangle rectangle, double width) {
        rectangle.setWidth(rectangle, width);
    }

    public void setHeight(Rectangle rectangle, double height) {
        rectangle.setHeight(rectangle, height);
    }

    public double getHeight(Rectangle rectangle) {
        return rectangle.getHeight(rectangle);
    }

    public abstract double area(Rectangle rectangle);
}
