package edu.giardim.Exercises_05;
import java.util.*;

public class BooleanLand {
    static public void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        fancyNumberPrint(input);

        input.close();

        int cnt = 10;
        int randIndex = (int)(Math.random() * cnt);
        System.out.println(randIndex);
    }

    static public void fancyNumberPrint(Scanner in)
    {
        if (in != null && in.hasNext())
        {
            int x  = in.nextInt();
            System.out.println("$$$ " + x + " $$$");
        }
    }
}
