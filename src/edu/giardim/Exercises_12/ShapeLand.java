package edu.giardim.Exercises_12;

import edu.giardim.Exercises_09.Matrix2D;
import edu.giardim.Exercises_13.InvalidRadiusException;

public class ShapeLand {
    public static void main (String [] args){
        //Circle has access to everything public in the shape class
        Circle c = new Circle();
        Shape s = new Shape(true, Matrix2D.makePoint2D(2, 8));
        Shape s2 = new Shape(false, Matrix2D.makePoint2D(7, -1));
        c.setFilled(true);
        System.out.println(c.isFilled());

        Circle c2 = new Circle(true, Matrix2D.makePoint2D(3, 5));
        System.out.println(c2.isFilled());
        System.out.println(s);
        System.out.println(s2);
        System.out.println(c);
        System.out.println(c2);
        try{
            Circle c3 = new Circle(7.8, false, Matrix2D.makePoint2D(-2, 9.5));
            System.out.println(c3);
        } catch(InvalidRadiusException e) {
            System.err.println(e);
        }

        //Cannot do this, circle does not have a constructor with
        // a string perameter
        // String g = "Hello";
        // Circle c4 = new Circle(g);

        System.out.println(Shape.getNameOfShape());
        System.out.println(Circle.getNameOfShape());


        //Polymorphism
        //Ask for something broad (shape) get something specific (circle)
        //Actual type = circle
        //Declared type = shape
        //Dynamic Binding - At runtime, deciding what version of method to use
        //      based off of actual type
        try{
            Shape sReallyC = new Circle(5.6);
            Shape sReallyR = new Rectangle(3, 9);

            System.out.println(sReallyC);
            System.out.println(sReallyR);

            Shape [] myShapes = new Shape[4];
            myShapes[0] = s;
            myShapes[1] = sReallyC;
            myShapes[2] = sReallyR;
            myShapes[3] = new Square(9);

            System.out.println("My shapes: ");
            for(Shape t : myShapes){
                System.out.println(t);
                printArea(t);
            }
        }
        catch(InvalidRadiusException e){
            System.err.println(e);
        }

        printShape(c2);
        
        try{
            
            Circle masterc = new Circle(5.7, true, Matrix2D.makePoint2D(1, 2));
            Circle diffRad = new Circle(9.1, true, Matrix2D.makePoint2D(1, 2));
            Circle diffFilled = new Circle(5.7, false, Matrix2D.makePoint2D(1, 2)   );
            Circle diffCenter = new Circle(5.7, true, Matrix2D.makePoint2D(3, 4))   ;

            System.out.println(masterc.equals(s));        
            System.out.println(masterc.equals(diffRad));
            System.out.println(masterc.equals(diffFilled));
            System.out.println(masterc.equals(diffCenter));
        } catch (InvalidRadiusException e){
            System.err.println(e);
        }
}
    
    public static void printShape(Shape s){
        System.out.println("MY GLORIOUS SHAPE: " + s);
    }

    public static void printArea(Shape s){
        System.out.println("Area = " + s.getArea());

        if (s instanceof Circle){
        //Downcasting - going down the inheritance tree
        Circle c = (Circle) s;
        System.out.println("* radius = " + c.getRadius());
        }

        if (s instanceof Rectangle r){
            System.out.println("* Widgth = " + r.getWidth());
        }
    }
}