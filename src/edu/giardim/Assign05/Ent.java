package edu.giardim.Assign05;

public class Ent extends Tree{
    //Constructor
    public Ent (String name){
        super(name);
    }

    @Override
    //Returns "HOOM"
    public String speak(){
        return "HOOM";
    }

    @Override
    //Returns string "Ent" and the toString method
    //  Of its parent
    public String toString(){
        return "Ent " + super.toString();
    }
}
