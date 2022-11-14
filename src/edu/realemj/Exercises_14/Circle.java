package edu.realemj.Exercises_14;

public class Circle extends CircleLike {
    private double radius;

    
    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
    
}
