package edu.giardim.Exercises_13;

import java.util.*;
import java.io.*;

public class Quotient {
    public static void inputPanic() throws IOException{
        int x = 0;
        try{
            if (x == 0){
            throw new IOException("Help");
            }
            System.out.println("never got here");
        }
        catch(ArithmeticException e){
            System.err.println("Math problems");
        }
        System.out.println("Panic over");
    }
    public static int quotient(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return a/b;
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try{
            int x = input.nextInt();
            int y = input.nextInt();
            int q = quotient(x, y);
            System.out.println("answer: " + q);
            inputPanic();
        }
        catch (ArithmeticException e){
            System.err.println(e);
        }
        catch (InputMismatchException e){
            System.err.println("Input must be an integer");
        }
        catch (Exception e){
            System.err.println("You did something wrong: " + e);
        }

        System.out.println("Program complete.");

        input.close();
    }
}
