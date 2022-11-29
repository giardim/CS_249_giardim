package edu.realemj.Exercises_15.Decorator;

public class CentralPerk {
    public static void main(String [] args) {
        Beverage b = new DarkRoast();
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Whip(b);

        System.out.println(b.getDescription());
        System.out.println(b.cost());

    }    
}
