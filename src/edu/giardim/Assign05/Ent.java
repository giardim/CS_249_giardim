package edu.giardim.Assign05;

public class Ent extends Tree{
    public Ent (String name){
        super(name);
    }

    @Override
    public String speak(){
        return "HOOM";
    }

    @Override
    public String toString(){
        return "Ent " + super.toString();
    }
}
