package edu.giardim.Exercises_11;
import java.util.*;

public class Party {
    private Person [] people;

    public Party(String [] names){
        people = new Person[names.length];
        for (int i = 0; i < names.length; ++i){
            people[i] = new Person(names[i]);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY:\n");
        boolean anyAlive = false;
        for (Person p : people){
            if (p.isAlive()){
                sb.append("* " + p + "\n");
                anyAlive = true;
            }
        }
        
        if (!anyAlive){
            sb.append("No one survived :'( \n");
        }

        return sb.toString();
    }

    public boolean areAnyAlive(){
        boolean anyAlive = false;

        for (Person p : people){
            if(p.isAlive()){
                anyAlive = true;
                break;
            }
        }
        return anyAlive;
    }

    public boolean killRandom(){
        if (!areAnyAlive()){
            return false;
        }

        //SOLUTION 1: Keep randomly picking indices -> inefficient

        //SOLUTION 2: 
        //get a list of indices of anyone who is alive
        //ArrayList only works with classes or objects, not primitives
        // ArrayList<Integer> indices = new ArrayList<Integer>;
        // for (int i = 0; i < people.length; ++i){
        //     if (people[i].isAlive()){
        //         indices.add(i); //AutoBoxing int --> Integer
        //     }
        // }
        // //randomly select one of thoes indices to murder
        // int randomIndex = (int)(Math.random() * indices.size());
        // int unfortunateIndex = indices.get(randomIndex); //Auto unboxing Integer -> int
        // people[unfortunateIndex].kill();
        // System.out.println(people[unfortunateIndex] + " has passed on.");

        //SOLUTION 3:
        //Maintain list of Persons who are still alive
        ArrayList<Person> stillAlive = new ArrayList<Person>();
        for (Person p : people){
            if (p.isAlive()){
                stillAlive.add(p);
            }
        } 
        int unfortunateIndex = (int)(Math.random()*stillAlive.size());
        stillAlive.get(unfortunateIndex).kill();
        System.out.println(stillAlive.get(unfortunateIndex) + " has passed on.");

        return true;
    }
}