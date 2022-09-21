package edu.giardim.Exercises_06;
import java.util.*;

public class Shopping {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int totalFood = 0;
        int totalBullets = 0;
        int totalAxles = 0;
        boolean keepShopping = true;

        do 
        {
            System.out.println("What would you like to buy?");
            int cnt = input.nextInt();
            String item = input.next();
            item = item.toLowerCase();

            if (cnt == 0)
            {
                keepShopping = false;
            }

            switch (item)
            {
                case "food" -> totalFood += cnt;
                case "bullet", "bullets" -> totalBullets += cnt;
                case "axle", "axles" -> totalAxles += cnt;
                default ->  
                {
                    System.out.println("I'm sorry but we don't carry " + item);
                    keepShopping = false;
                }

            }

        System.out.println("Total food: " + totalFood);
        System.out.println("Total bullets: " + totalBullets);
        System.out.println("Total axles: " + totalAxles);

        } while (keepShopping);


        

        


        input.close();
    }
}
