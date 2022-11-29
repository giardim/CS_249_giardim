package edu.realemj.Exercises_14;

import java.util.*;

public class SortCircles {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Circle [] myCircles = new Circle[5];

        for(int i = 0; i < myCircles.length; i++) {
            System.out.println("Enter radius for circle " + i + ":");
            double r = input.nextDouble();
            myCircles[i] = new Circle(r);
        }

        Arrays.sort(myCircles);

        System.out.println("SORTED CIRCLES:");
        for(Circle c: myCircles) {
            System.out.println("* " + c);
        }

    }
    
}
