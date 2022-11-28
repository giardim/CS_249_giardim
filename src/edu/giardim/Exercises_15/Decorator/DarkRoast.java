package edu.giardim.Exercises_15.Decorator;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        super("Dark Roast");
    }

    public double cost(){
        return .99;
    }
}
