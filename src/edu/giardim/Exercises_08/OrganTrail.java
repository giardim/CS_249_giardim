package edu.giardim.Exercises_08;
import java.util.*;

public class OrganTrail {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String [] names = getPartyNames(input);
        String [] disasters = {"a broken leg", "dysentery",
                                "been bitten by a zombie",
                                "a gunshot wound"};
        final int days = 10;
        for (int i = 0; i < days; ++i){
            System.out.println("** DAY "+ (i + 1) + "  **");
            String currentDisaster = pickRandomString(disasters);
            String currentPerson = pickRandomString(names);
            System.out.println(currentPerson + " has " + currentDisaster);
        }

        input.close();
    }

    public static String[] getPartyNames(Scanner input){
        System.out.println("Enter party count:");
        int cnt = input.nextInt();
        String [] names = new String[cnt];
        System.out.println("Enter names:");

        for (int i = 0; i < cnt; ++i){
            names[i] = input.next();
        }

        return names;
    }
    public static String pickRandomString(String[] data){
        int randIndex = (int)(Math.random() * data.length);
        return data[randIndex];
    }
    
}
