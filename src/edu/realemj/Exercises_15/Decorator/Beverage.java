package edu.realemj.Exercises_15.Decorator;

public abstract class Beverage {
    private String description = "";

    protected Beverage() {}
    protected Beverage(String desc) {
        description = desc;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();


    
}
