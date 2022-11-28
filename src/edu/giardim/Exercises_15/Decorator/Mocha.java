package edu.giardim.Exercises_15.Decorator;

public class Mocha extends CondimentDecorator{
    private Beverage inside;

    public Mocha (Beverage inside){
        this.inside = inside;
    }

    @Override 
    public double cost(){
        return this.cost() + 0.20;
    }

    @Override
    public String getDescription(){
        return inside.getDescription() + ", " + "mocha";
    }
}
