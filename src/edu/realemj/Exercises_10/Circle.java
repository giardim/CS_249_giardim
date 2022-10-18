package edu.realemj.Exercises_10;

import edu.realemj.Exercises_09.Matrix2D;

public class Circle {
    private static final double DEFAULT_RADIUS = 1.0;
    private static final Matrix2D DEFAULT_POS
             = Matrix2D.makePoint2D(0,0);

    private double radius = DEFAULT_RADIUS;
    private Matrix2D pos = DEFAULT_POS;

    public Circle() {
        // Do nothing
    }

    public Circle(double radius) {
        //setRadius(radius);        
        this(radius, DEFAULT_POS);
    }

    public Circle(Matrix2D pos) {
        //setCenter(pos);
        this(DEFAULT_RADIUS, pos);
    }

    public Circle(double radius, Matrix2D pos) {
        setRadius(radius);
        setCenter(pos);
    }

    public Circle(Circle other) {
        this.radius = other.radius;
        this.pos = new Matrix2D(other.pos);
    }
    
    public String toString() {
        String s = "Circle with radius " + radius;
        s += " at";
        s += " (" + pos.getValue(0,0);
        s += "," + pos.getValue(1,0) + ")";
        return s;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0) {
            this.radius = radius;
        }
    }

    public Matrix2D getCenter() {
        return new Matrix2D(pos);
    }

    public void setCenter(Matrix2D p) {
        pos = new Matrix2D(p);
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getPerimeter() {
        return 2.0*Math.PI*radius;
    }
}
