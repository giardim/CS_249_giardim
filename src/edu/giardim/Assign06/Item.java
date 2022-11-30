package edu.giardim.Assign06;

import java.util.Scanner;

public class Item implements Loadable{
    private String id = "";
    private int value = 0;

    public Item(){
        //do nothing
    }

    public Item (String id, int value){
        setID(id);
        setValue(value);
    }

    public String getID(){
        return id;
    }

    public int getValue(){
        return value;
    }

    public void setID(String id){
        this.id = id;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return id + " with value " + value;
    }

    public void load(Scanner input) throws GameFileException{
        try{
            id = input.next();
            value = input.nextInt();
        } catch (Exception e){
            this.id = "";
            this.value = 0;
            throw new GameFileException("Error loading Item", e);
        }
    }
}
