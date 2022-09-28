package edu.realemj.Exercises_08;

import java.util.*;

public class OrganTrail {
    public static String [] getPartyNames(Scanner input) {
        System.out.println("Enter party count:");
        int cnt = input.nextInt();

        String [] names = new String[cnt];

        System.out.println("Enter names:");
        for(int i = 0; i < cnt; i++) {
            names[i] = input.next();
        }

        return names; // new String[] {"Bob"};
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        // Get names from user
        String [] names = getPartyNames(input);

        // Create disaster list
        String [] disasters = { "a broken leg",
                                "dysentery",
                                "been bitten by zombie",
                                "a gunshot wound"};
        
        int days = 10;
        for(int i = 0; i < days; i++) {
            System.out.println("** DAY " + i + " **");

            // Pick random person        
            String currentPerson = pickRandomString(names);

            // Pick random disaster        
            String currentDisaster = pickRandomString(disasters);

            // Print results
            System.out.println(currentPerson + " has " 
                                + currentDisaster + "!");       
        }
    }    

    public static String pickRandomString(String [] data) {
        int randIndex = (int)(Math.random()*data.length);
        return data[randIndex];
    }
}
