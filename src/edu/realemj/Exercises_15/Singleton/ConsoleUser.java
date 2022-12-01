package edu.realemj.Exercises_15.Singleton;

public class ConsoleUser {
    public static void main(String [] args) {
        System.out.println("Enter number:");
        ConsoleReader cr = ConsoleReader.getInstance();
        int x = cr.getInput().nextInt();
        System.out.println("Your answer:" + x);
    }    
}
