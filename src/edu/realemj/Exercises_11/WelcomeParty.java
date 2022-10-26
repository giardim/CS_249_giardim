package edu.realemj.Exercises_11;

import java.util.*;

public class WelcomeParty {

    public static Party askForParty(Scanner input) {
        System.out.println("Enter number of people:");
        String numS = input.nextLine();
        int num = Integer.parseInt(numS);

        String [] names = new String[num];
        System.out.println("Enter names:");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        Party p = new Party(names);
        return p;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Party p = askForParty(input);
        System.out.println(p);

        while(p.areAnyAlive()) {
            p.killRandom();
            System.out.println(p);
        }
    }    
}
