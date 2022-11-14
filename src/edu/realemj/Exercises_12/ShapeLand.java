package edu.realemj.Exercises_12;

import edu.realemj.Exercises_09.Matrix2D;
import edu.realemj.Exercises_13.InvalidRadiusException;

public class ShapeLand {
    public static void main(String [] args) {
        Circle c = new Circle();
        Shape s = new Shape(true, Matrix2D.makePoint2D(2,8));
        Shape s2 = new Shape(false, Matrix2D.makePoint2D(7,-1));

        c.setFilled(true);
        System.out.println(c.isFilled());

        Circle c2 = new Circle(true, 
                            Matrix2D.makePoint2D(3,5));
        
        System.out.println(s);
        System.out.println(s2);
        System.out.println(c);
        System.out.println(c2);

        Circle c3 = null;

        try {
            c3 = new Circle(7.8, false, 
                                Matrix2D.makePoint2D(-2, 9.5));       
            System.out.println(c3);
        }
        catch(InvalidRadiusException e) {
            System.err.println(e);            
        }

        printShape(c3);

        System.out.println(c2.getRadius());

        System.out.println(Shape.getNameOfShape());
        System.out.println(Circle.getNameOfShape());

        // Polymorphism
        // Effectively upcasting here
        try {
            Shape sReallyC = new Circle(5.6);
            Shape sReallyR = new Rectangle(3,9);

            System.out.println(sReallyC);
            System.out.println(sReallyR);
            
            Shape [] myShapes = new Shape[4];
            myShapes[0] = s;
            myShapes[1] = sReallyC;
            myShapes[2] = sReallyR;
            myShapes[3] = new Square(9);

            printShape(c2);

            System.out.println("My shapes:");
            for(Shape t: myShapes) {
                System.out.println(t);
                printArea(t);
            }
        }
        catch(InvalidRadiusException e) {
            System.err.println(e);
        }

        try {
            Circle masterC = new Circle(5.7, true, 
                                        Matrix2D.makePoint2D(1,2));

            Circle otherC = new Circle(5.7, true, 
                                        Matrix2D.makePoint2D(1,2));

            Circle diffRad = new Circle(9.1, true, 
                                        Matrix2D.makePoint2D(1,2));

            Circle diffFilled = new Circle(5.7, false, 
                                        Matrix2D.makePoint2D(1,2));

            Circle diffCenter = new Circle(5.7, true, 
                                        Matrix2D.makePoint2D(3,4));

            System.out.println(masterC.equals(s));
            System.out.println(masterC.equals(diffRad));
            System.out.println(masterC.equals(diffFilled));
            System.out.println(masterC.equals(diffCenter));
            System.out.println(masterC.equals(otherC));
        }
        catch(InvalidRadiusException e) {
            System.err.println(e);
        }
    }    

    public static void printShape(Shape s) {
        System.out.println("MY GLORIOUS SHAPE: " + s);
    }

    public static void printArea(Shape s) {
        System.out.println("Area = " + s.getArea());

        if(s instanceof Circle) {
            // Downcasting
            Circle c = (Circle)s;
            System.out.println("* radius = " + c.getRadius());
            System.out.println("* radius = " + ((Circle)s).getRadius());
        }

        if(s instanceof Rectangle r) {
            System.out.println("* width = " + r.getWidth());
        }
    }
}
