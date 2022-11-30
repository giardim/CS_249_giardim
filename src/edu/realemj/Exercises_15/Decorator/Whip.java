package edu.realemj.Exercises_15.Decorator;

public class Whip extends CondimentDecorator {
    private Beverage inside;

    public Whip(Beverage inside) {
        this.inside = inside;
    }

    public String getDescription() {
        return inside.getDescription()
                + ", " + "whip";
    }

    public double cost() {
        return inside.cost() + 0.10;
    }    
}
