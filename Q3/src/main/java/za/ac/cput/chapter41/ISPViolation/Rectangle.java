package za.ac.cput.chapter41.ISPViolation;

/**
 * Created by Abel on 2016-03-26.
 */
public class Rectangle implements Calculate {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

  //  @Override
    public double area(){
        return width * height;
    }

   // @Override
    public double radius(){

        return 0;
    }
}
