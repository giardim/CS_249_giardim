package edu.realemj.Exercises_05;

import java.util.*;

public class BooleanLand {
    public static void main(String [] args) {
        Scanner input = null;
        fancyNumberPrint(input);
        input = new Scanner(System.in);
        System.out.println("Enter number:");
        //fancyNumberPrint(input);

        int cnt = 10;
        int randIndex = (int)(Math.random()*cnt);
        System.out.println(randIndex);
    }

    public static void fancyNumberPrint(Scanner in) {
        if(in != null && in.hasNext()) {
        //if(in.hasNext()) {
            int x = in.nextInt();
            System.out.println("$$$ " + x + " $$$");
        }
    }    
}
