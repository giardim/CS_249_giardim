package edu.realemj.Exercises_15.Decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("dark roast");
    }

    public double cost() {
        return 0.99;
    }    
}
