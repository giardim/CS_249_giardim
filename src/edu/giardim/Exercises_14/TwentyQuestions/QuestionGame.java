package edu.giardim.Exercises_14.TwentyQuestions;

import java.util.*;

import javax.sound.midi.SysexMessage;

import org.testng.internal.junit.ArrayAsserts;

public class QuestionGame {
    public static void main (String [] args){
        ArrayList <Edible> food = new ArrayList<>();
        ArrayList <Flammable> fuel = new ArrayList<>();
        ArrayList <Animal> zoo = new ArrayList<>();

        food.add(new Apple());
        food.add(new Apple());
        food.add(new Chicken());

        fuel.add(new Cedar());
        fuel.add(new Chicken());
        fuel.add(new Apple());

        zoo.add(new Toad());
        zoo.add(new Chicken());

        System.out.println("FOOD:");
        for (Edible e : food){
            System.out.println("- " + e.howToEat());
        }

        System.out.println("ANIMALS: ");
        for (Animal a : zoo){
            System.out.println("- " + ((Flammable)a).howToIgnite());
        }
    }
}
