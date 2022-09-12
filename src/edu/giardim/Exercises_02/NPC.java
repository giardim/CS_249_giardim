package edu.giardim.Exercises_02;

public class NPC {
    private int health;
    private int strength;
    private char relationship;

    //Constructor
    //Public nameofclass (NO RETURN TYPE)

    public NPC()
    {
        health = 100;
    }

    public NPC (int h)
    {
        setHealth(h);
    }

    public NPC (int h, int s)
    {
        setHealth(h);
        strength = s;
    }

    //getters -> allow us to get the data in the 
    //main function. We can only read the data, not write
    public int getHealth()
    {
        return health;
    }

    public int getStrength()
    {
        return strength;
    }

    public char getRelationship()
    {
        return relationship;
    }

    //setter function -> write to the data

    void setHealth(int h)
    {
        health = h;
        //The program will choose the max between 0 and health
        //if negative it will choose 0
        health = Math.max(0, health);
    }
}
