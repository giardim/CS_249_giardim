package edu.giardim.Assign05;

public class Tree extends Giant{
    public Tree (String name){
        super(name);
    }

    public String speak(){
        return "<rustling>";
    }

    @Override
    public String toString(){
        return super.toString() + " of the trees";
    }
}
