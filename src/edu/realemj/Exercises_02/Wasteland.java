package edu.realemj.Exercises_02;

public class Wasteland {

    public static void main(String [] args) {
        NPC bob = new NPC();    
        NPC sue = new NPC();
        NPC ted = new NPC(74);
        NPC carl = new NPC(12, 56);

        bob.setHealth(-78);
        sue.setHealth(91);

        System.out.println("Bob: " + bob.getHealth());
        System.out.println("Sue: " + sue.getHealth());

    }    
}
