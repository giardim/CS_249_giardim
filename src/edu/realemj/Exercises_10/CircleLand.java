package edu.realemj.Exercises_10;
import edu.realemj.Exercises_09.Matrix2D;

public class CircleLand {
    public static void main(String [] args) {

        Circle c = new Circle();
        double r = c.getRadius();
        r = 10.0;
        System.out.println(c.getRadius());

        Matrix2D p = c.getCenter();
        System.out.println("BEFORE: " + p);
        p.setValue(0,0,45);  
        System.out.println("AFTER: " + c.getCenter());
    }
    
}
