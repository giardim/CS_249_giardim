package edu.giardim.Assign05;

public class Giant {
    private String name;

    //Constructor
    public Giant (String name){
        setName(name);
    }

    //Returns the name of the giant
    public String getName(){
        return name;
    }

    //Sets the name of the giant
    public void setName(String name){
        this.name = name;
    }

    //Returns the name of the giant
    public String toString(){
        return getName();
    }
}
