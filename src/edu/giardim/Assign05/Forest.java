package edu.giardim.Assign05;

import java.util.*;

public class Forest {
    private ArrayList <Giant> allG = new ArrayList<>();

    public Giant createGiant(String name, String typeName){
        if (name.length() == 0) return null;
        Giant g;
        switch(typeName){
            case "GIANT" -> {
                g = new Giant(name);
            }
            case "TROLL" -> {
                g = new Troll(name);
            }
            case "TREE" -> {
                g = new Tree(name);
            }
            case "ENT" -> {
                g = new Ent(name);
            }
            case "HUORN" -> {
                g = new Huorn(name);
            }
            default -> {
                return null;
            }
        }
        return g;
    }

    public boolean addGiant(String name, String typeName){
        Giant g = createGiant(name, typeName);
        boolean isNull = false;

        if (g != null){
            allG.add(g);
            isNull = true;
        }

        return isNull;
    }

    public Giant getGiant(int index){
        if (index >= 0 && index < allG.size()){
            return allG.get(index);
        }
        return null;
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for (Giant g : allG){
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for (Giant g : allG){
            if (g instanceof Tree t){
                System.out.println("- " + t.toString() + ": " + t.speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for (Giant g : allG){
            if (g instanceof Troll t){
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }

}
