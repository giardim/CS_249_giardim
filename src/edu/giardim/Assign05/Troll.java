package edu.giardim.Assign05;

public class Troll extends Giant{
    public Troll(String name){
        super(name);
    }

    public String cook(){
        return "Mutton again...";
    }

    @Override
    public String toString(){
        return "Troll " + super.toString();
    }
}
