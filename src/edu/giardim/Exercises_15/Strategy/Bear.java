package edu.giardim.Exercises_15.Strategy;

public abstract class Bear {
    protected Moveable mBehavior;

    protected Bear (Moveable m){
        mBehavior = m;
    }

    public void performMove(){
        mBehavior.move();
    }

    public void setMoveBehavior(Moveable m){
        mBehavior = m;
    }
}
