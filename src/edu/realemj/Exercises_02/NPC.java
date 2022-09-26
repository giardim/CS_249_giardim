package edu.realemj.Exercises_02;

public class NPC {
    
    private int health;
    private int strength;
    private char relationship;
    
    public NPC() {

    }

    public NPC(int h) {
        //health = h;
        setHealth(h);
    }

    public NPC(int h, int s) {
        //health = h;
        setHealth(h);
        strength = s;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public char getRelationship() {
        return relationship;
    }

    public void setHealth(int h) {
        health = h;
        health = Math.max(0, health);

        //if(health < 0) {
        //    health = 0;
        //}
    }
    
}
