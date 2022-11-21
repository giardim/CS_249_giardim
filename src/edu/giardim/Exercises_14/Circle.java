package edu.giardim.Exercises_14;

public class Circle extends CircleLike implements Comparable<Circle>{
    private double radius;

    public Circle(){
        //
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public String toString(){
        return "Circle with radius " + radius;
    }

    @Override
    public boolean equals(Object Other){
        boolean e = false;
        if (Other instanceof Circle c){
            double diff = Math.abs(radius - c.radius);
            if (diff < 1e-15){
                e = true;
            }
        }
        return e;
    }

    @Override
    public int compareTo(Circle other) {
        if (this.equals(other)){
            return 0;
        }
        else if (radius < other.radius){
            return -1;
        }
        return 1;
    }
}
