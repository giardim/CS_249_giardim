package edu.giardim.Assign06;

import java.util.Scanner;

public class Item implements Loadable{
    //Instance variables
    private String id = "";
    private int value = 0;

    //Constructors
    public Item(){
        //do nothing
    }

    public Item (String id, int value){
        setID(id);
        setValue(value);
    }

    //Return ID
    public String getID(){
        return id;
    }

    //Return value
    public int getValue(){
        return value;
    }

    //Set the ID
    public void setID(String id){
        this.id = id;
    }

    //Set the Value
    public void setValue(int value){
        this.value = value;
    }

    //Return the string with the id and value
    public String toString(){
        return id + " with value " + value;
    }

    //Load the map
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
