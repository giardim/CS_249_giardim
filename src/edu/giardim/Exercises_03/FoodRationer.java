package edu.giardim.Exercises_03;

import java.util.Scanner;

public class FoodRationer {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total food:");
        int totalFood = input.nextInt();

        System.out.println("Enter people cnt:");
        int peopleCnt = input.nextInt();

        System.out.println("Enter rations:");
        double rations = input.nextDouble();

        double foodPerDay = peopleCnt * rations;
        int days = (int)(totalFood / foodPerDay);

        System.out.println("Days left: " + days);

        input.close();
    }
}
