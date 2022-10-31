package edu.realemj.Exercises_12;

import edu.realemj.Exercises_09.Matrix2D;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {        
        // IMPLICIT: super()        
    }

    public Circle(double radius) {
        // IMPLICIT: super()
        //this.radius = radius;
        setRadius(radius);
    }

    public Circle(boolean filled, Matrix2D center) {
        super(filled, center);
        //this.filled = filled;
        //setCenter(center);
    }

    public Circle(double radius, boolean filled, Matrix2D center) {
        super(filled, center);
        //this.radius = radius;
        //this.filled = filled;
        //setCenter(center);
        setRadius(radius);       
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += ", radius " + radius;
        return s;
    }
}
