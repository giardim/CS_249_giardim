package edu.realemj.Exercises_15.Decorator;

public class Mocha extends CondimentDecorator {
    private Beverage inside;

    public Mocha(Beverage inside) {
        this.inside = inside;
    }

    public String getDescription() {
        return inside.getDescription()
                + ", " + "mocha";
    }

    public double cost() {
        return inside.cost() + 0.20;
    }    
}
