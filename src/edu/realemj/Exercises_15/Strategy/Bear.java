package edu.realemj.Exercises_15.Strategy;

public abstract class Bear {
    protected Moveable mbehavior;

    protected Bear(Moveable m) {
        mbehavior = m;
    }

    public void performMove() {
        mbehavior.move();
    }  
    
    public void setMoveBehavior(Moveable m) {
        mbehavior = m;
    }
}
