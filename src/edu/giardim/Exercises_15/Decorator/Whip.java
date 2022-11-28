package edu.giardim.Exercises_15.Decorator;

public class Whip extends CondimentDecorator{
    private Beverage inside;

    public Whip (Beverage inside){
        this.inside = inside;
    }

    @Override 
    public double cost(){
        return this.cost() + 0.10;
    }

    @Override
    public String getDescription(){
        return inside.getDescription() + ", " + "whip";
    }
}
