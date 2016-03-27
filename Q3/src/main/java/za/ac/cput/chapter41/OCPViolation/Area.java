package za.ac.cput.chapter41.OCPViolation;

/**
 * Created by Abel on 2016-03-27.
 */
public class Area {

    public double area(Object shape){

        if(shape instanceof Rectangle){

            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getHeight() * rectangle.getWidth();
        }
        else{

            Square square = (Square) shape;
            return square.getLength() * square.getLength();
        }


    }
}
