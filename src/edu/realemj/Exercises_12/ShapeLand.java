package edu.realemj.Exercises_12;

import edu.realemj.Exercises_09.Matrix2D;

public class ShapeLand {
    public static void main(String [] args) {
        Circle c = new Circle();
        Shape s = new Shape(true, Matrix2D.makePoint2D(2,8));
        Shape s2 = new Shape(false, Matrix2D.makePoint2D(7,-1));

        c.setFilled(true);
        System.out.println(c.isFilled());

        Circle c2 = new Circle(true, 
                            Matrix2D.makePoint2D(3,5));
        Circle c3 = new Circle(7.8, false, 
                               Matrix2D.makePoint2D(-2, 9.5));

        System.out.println(s);
        System.out.println(s2);
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        
    }    
}
