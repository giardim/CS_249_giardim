package edu.giardim.Exercises_12;

public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(){
        //do nothing
    }

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width*height;
    }

    @Override
    public String toString(){
        String s = super.toString();
        s = "Rectangle -> " + s;
        s += ", (" + width + " x " + height + ")";
        return s; 
    }

}
