package edu.giardim.Assign05;

import java.util.*;

public class Forest {
    //Create ArrayList of Giants
    private ArrayList <Giant> allG = new ArrayList<>();

    public Giant createGiant(String name, String typeName){
        //If the string passed in is empty, return null
        if (name.length() == 0) return null;
        //Initialize Giant g
        Giant g;

        //If the type name is...
        switch(typeName){
            //GIANT
            case "GIANT" -> {
                //set g to a new Giant passing name
                g = new Giant(name);
            }
            //TROLL
            case "TROLL" -> {
                //set g to a new Troll passing name
                g = new Troll(name);
            }
            //TREE
            case "TREE" -> {
                //set g to a new Tree passing name
                g = new Tree(name);
            }
            //ENT
            case "ENT" -> {
                //set g to a new Ent passing name
                g = new Ent(name);
            }
            //HUORN
            case "HUORN" -> {
                //set g to a new Huorn passing name
                g = new Huorn(name);
            }
            //else
            default -> {
                return null;
            }
        }
        //return the created object
        return g;
    }

    public boolean addGiant(String name, String typeName){
        //Set g to the giant created
        Giant g = createGiant(name, typeName);
        //Initialize boolean variable
        boolean isNull = false;

        //if g is not null
        if (g != null){
            //add the object to th ArrayList
            allG.add(g);
            //Set the boolean to true
            isNull = true;
        }

        //return the boolean
        return isNull;
    }

    public Giant getGiant(int index){
        //If the index is in bounds
        if (index >= 0 && index < allG.size()){
            //Return the object at that index
            return allG.get(index);
        }
        //Else return null
        return null;
    }

    public void printAllGiants(){
        //Print out all of the Giants in the list
        System.out.println("ALL GIANTS:");
        for (Giant g : allG){
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees(){
        //Print out all of the Trees in the list
        System.out.println("ALL TREES:");
        for (Giant g : allG){
            if (g instanceof Tree t){
                System.out.println("- " + t.toString() + ": " + t.speak());
            }
        }
    }

    public void printAllTrolls(){
        //Print out all of the Trolls in the list
        System.out.println("ALL TROLLS:");
        for (Giant g : allG){
            if (g instanceof Troll t){
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }

}
