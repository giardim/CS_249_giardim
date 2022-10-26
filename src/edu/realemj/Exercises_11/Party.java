package edu.realemj.Exercises_11;

import java.util.*;

public class Party {
    private Person [] people;

    public Party(String [] names) {
        people = new Person[names.length];
        for(int i = 0; i < names.length; i++) {
            people[i] = new Person(names[i]);
        }
    }   

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PARTY:\n");        
        boolean anyAlive = false;
        /*
        for(int i = 0; i < people.length; i++) {
            if(people[i].isAlive()) {
                sb.append("* " + people[i] + "\n");
                anyAlive = true;
            }
        }
        */

        for(Person p: people) {
            if(p.isAlive()) {
                sb.append("* " + p + "\n");
                anyAlive = true;
            }
        }

        if(!anyAlive) {
            sb.append("No one survived :'( \n");
        }

        return sb.toString();
    }

    public boolean areAnyAlive() {
        boolean anyAlive = false;
        for(Person p: people) {
            if(p.isAlive()) {                
                anyAlive = true;
                break;
            }
        }
        return anyAlive;
    }

    public boolean killRandom() {
        if(!areAnyAlive()) {
            return false;
        }

        // SOLUTION 1: Keep randomly picking indices --> inefficient

        // SOLUTION 2:
        /*
        // Get a list of indices of anyone who is alive
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for(int i = 0; i < people.length; i++) {
            if(people[i].isAlive()) {
                indices.add(i); // Autoboxing int --> Integer
            }
        }

        // Randomly select one of those indices to murder
        int randIndex = (int)(Math.random()*indices.size());
        int unfortunateIndex = indices.get(randIndex); // Autounboxing Integer --> int
        people[unfortunateIndex].kill();
        System.out.println(people[unfortunateIndex] + " has passed on.");
        */

        // SOLUTION 3: 
        // Maintain list of Persons who are still alive
        ArrayList<Person> stillAlive = new ArrayList<Person>();
        for(Person p: people) {
            if(p.isAlive()) {
                stillAlive.add(p);
            }
        }

        int unfortunateIndex = (int)(Math.random()*stillAlive.size());
        stillAlive.get(unfortunateIndex).kill();
        System.out.println(stillAlive.get(unfortunateIndex) + " has passed on.");

        return true;
    }      
}
