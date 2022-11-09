package edu.giardim.Exercises_12;

import edu.giardim.Exercises_09.Matrix2D;
import edu.giardim.Exercises_13.InvalidRadiusException;

public class Circle extends Shape{
    private double radius = 1.0;
    
    public Circle(){
        //do nothing
    }

    public Circle(double radius) throws InvalidRadiusException{
        setRadius(radius);
    }

    public Circle (boolean filled, Matrix2D center){
        super(filled, center); 
        // //Filled is protected so we can acces it in circle
        // this.filled = filled;
        
        // //Center is private so we must use a center setter
        // setCenter(center);
    }

    public Circle (double radius, boolean filled, Matrix2D center) throws InvalidRadiusException{
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

    public void setRadius(double radius) throws InvalidRadiusException{
        if (radius >= 0){
            this.radius = radius;
        } else{
            throw new InvalidRadiusException("No negative radii " + radius);
        }
    }

    public String toString(){
        String s = super.toString();
        s = "Circle -> " + s; 
        s += ", radius " + radius;
        return s;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public static String getNameOfShape(){
        return "Circle";
    }

    @Override
    public boolean equals(Object other){
        boolean isEqual = false;
        if(other instanceof Circle co){
            if (Math.abs(radius - co.radius) < 1e-15 && super.equals(co)){
                isEqual = true;
            }
        }
        return isEqual;
    }


}
