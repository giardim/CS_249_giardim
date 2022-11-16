package edu.giardim.Assign05;

public class Huorn extends Tree{
    //Constructor
    public Huorn(String name){
        super(name);
    }

    @Override
    //Returns "<Angry rustling>"
    public String speak(){
        return "<angry rustling>";
    }

    @Override
    //Returns a string that contains "Huorn" and uses
    //  the toString fuction from its parent
    public String toString(){
        return "Huorn " + super.toString();
    }
}
