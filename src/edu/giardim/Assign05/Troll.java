package edu.giardim.Assign05; 

public class Troll extends Giant{
    //Constructor
    public Troll(String name){
        super(name);
    }

    //Returns string "Mutton again..."
    public String cook(){
        return "Mutton again...";
    }

    @Override
    //Returns "Troll " and parent method of toString
    public String toString(){
        return "Troll " + super.toString();
    }
}
