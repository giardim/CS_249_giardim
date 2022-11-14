package edu.realemj.Assign05;

import java.util.Scanner;

public class BookOfLostTales {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Forest fangorn = new Forest();

        String typeName = "";
        boolean keepGoing = true;

        do {
            System.out.println("**********");
            System.out.println("Enter name:");
            String name = input.nextLine().trim();
            System.out.println("Enter type:");
            typeName = input.nextLine().toUpperCase().trim();
            System.out.println("**********");

            keepGoing = fangorn.addGiant(name, typeName);

        }while(keepGoing);

        fangorn.printAllGiants();
        fangorn.printAllTrees();
        fangorn.printAllTrolls();
    }
}
