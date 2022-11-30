package edu.realemj.Exercises_15.Strategy;

public class GrizzlyBear extends Bear {
    public GrizzlyBear() {
        super(new MoveWithFourLegs());
    }    
}
