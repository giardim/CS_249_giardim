package edu.realemj.Exercises_15.Strategy;

public class BearSimulator {
    public static void main(String [] args) {

        Bear yogi = new GrizzlyBear();
        Bear pooh = new TeddyBear();

        yogi.performMove();
        pooh.performMove();

        yogi.setMoveBehavior(new MoveWithTwoLegs());
        yogi.performMove();
    }    
}
