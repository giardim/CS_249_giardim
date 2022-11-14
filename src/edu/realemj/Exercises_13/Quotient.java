package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;

public class Quotient {
    public static void inputPanic() throws IOException {
        /*
        // METHOD 1: Handle it here
        try {
            throw new IOException("HELP!");
        //throw new ArithmeticException();
        }
        catch(IOException e) {
            System.err.println("There. Handled.");
        }
        */

        int x = 0;

        try {
            // METHOD 2: Declare it
            if(x == 0) {
                throw new IOException("HELP!");   
            }
            System.out.println("Never get here.");         
        }
        catch(ArithmeticException ex) {
            System.err.println("Math problems!");
        }

        System.out.println("Panic over.");
    }

    public static int quotient(int a, int b) {
        //return a/b;

        if(b == 0) {
            //return 0;
            throw new ArithmeticException("DIVIDE NOT BY ZERO!");
        }
        else {
            return a/b;
        }
    }



    public static void main(String [] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try {
            int x = input.nextInt();
            int y = input.nextInt();
            int q = quotient(x,y);
            System.out.println("Answer = " + q);
            //input = null;
            //int a = input.nextInt();
            inputPanic();            
        }        
        catch(ArithmeticException e) {
            System.err.println(e);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch(InputMismatchException e) {
            System.err.println("Why would you do this to me?");
            e.printStackTrace();
        }
        catch(Exception ex) {
            System.err.println("WHAAAAAA???? " + ex);
        }
        

        System.out.println("Program complete.");
    }
    
}
