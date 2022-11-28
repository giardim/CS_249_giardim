package edu.giardim.Exercises_15.Decorator;

public abstract class Beverage {
    private String description = "";
    
    protected Beverage (){}
    protected Beverage (String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
