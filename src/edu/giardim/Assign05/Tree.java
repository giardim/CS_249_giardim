package edu.giardim.Assign05;

public class Tree extends Giant{
    //Constructor
    public Tree (String name){
        super(name);
    }

    //Returns "<rustling>"
    public String speak(){
        return "<rustling>";
    }

    @Override
    //Returns parent method of toString and "of the trees"
    public String toString(){
        return super.toString() + " of the trees";
    }
}
