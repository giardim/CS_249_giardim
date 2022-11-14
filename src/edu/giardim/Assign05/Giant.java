package edu.giardim.Assign05;

public class Giant {
    private String name;

    public Giant (String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return getName();
    }
}
