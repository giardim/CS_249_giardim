package edu.giardim.Exercises_12;

import edu.giardim.Exercises_09.Matrix2D;

public class Circle extends Shape{
    private double radius = 1.0;
    
    public Circle(){
        //do nothing
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle (boolean filled, Matrix2D center){
        super(filled, center); 
        // //Filled is protected so we can acces it in circle
        // this.filled = filled;
        
        // //Center is private so we must use a center setter
        // setCenter(center);
    }

    public Circle (double radius, boolean filled, Matrix2D center){
        super(filled, center);
        setRadius(radius);
        // //Filled is protected so we can acces it in circle
        // this.filled = filled;
        
        // //Center is private so we must use a center setter
        // setCenter(center);
    }

    public double getRadius (){
        return radius;
    }

    public void setRadius(double radius){
        if (radius >= 0){
            this.radius = radius;
        }
    }

    public String toString(){
        String s = super.toString();
        s += ", radius " + radius;
        return s;
    }
}
