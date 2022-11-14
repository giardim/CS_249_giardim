package edu.realemj.Exercises_12;

import edu.realemj.Exercises_09.Matrix2D;
import edu.realemj.Exercises_13.InvalidRadiusException;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {        
        // IMPLICIT: super()        
    }

    public Circle(double radius) throws InvalidRadiusException {
        // IMPLICIT: super()
        //this.radius = radius;
        setRadius(radius);
    }

    public Circle(boolean filled, Matrix2D center) {
        super(filled, center);
        //this.filled = filled;
        //setCenter(center);
    }

    public Circle(double radius, boolean filled, Matrix2D center)
                    throws InvalidRadiusException {
        super(filled, center);
        //this.radius = radius;
        //this.filled = filled;
        //setCenter(center);
        setRadius(radius);       
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new InvalidRadiusException(
                "No negative radii! " + radius);
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s = "Circle -> " + s;
        s += ", radius " + radius;
        return s;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    
    public static String getNameOfShape() {
        return "Circle";
    }

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;

        if(other instanceof Circle co) {
            if(Math.abs(radius - co.radius) < 1e-15
                && super.equals(co)) {
                isEqual = true;
            }            
        }
        
        return isEqual;
    }
}
