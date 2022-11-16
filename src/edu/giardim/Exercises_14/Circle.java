package edu.giardim.Exercises_14;

public class Circle extends Shape{
    private double radius;

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }
}
