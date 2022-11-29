package edu.realemj.Exercises_14.TwentyQuestions;

import java.util.*;

public class QuestionGame {
    public static void main(String [] args) {
        ArrayList<Edible> food = new ArrayList<>();
        ArrayList<Flammable> fuel = new ArrayList<>();
        ArrayList<Animal> zoo = new ArrayList<>();

        food.add(new Chicken());
        food.add(new Apple());
        food.add(new Apple());

        fuel.add(new Cedar());
        fuel.add(new Chicken());
        fuel.add(new Apple());

        zoo.add(new Chicken());
        zoo.add(new Toad());
        zoo.add(new Chicken());

        System.out.println("FOOD:");
        for(Edible e: food) {
            System.out.println("- " + e.howToEat());
        }

        System.out.println("ANIMALS:");
        for(Animal a: zoo) {
            if(a instanceof Flammable) {
                System.out.println("- " + ((Flammable)a).howToIgnite());
            }
        }





    }    
}
