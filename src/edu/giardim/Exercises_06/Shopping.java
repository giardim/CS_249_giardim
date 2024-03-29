package edu.giardim.Exercises_06;
import java.util.*;

public class Shopping {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        Supplies supplies = new Supplies();
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
                case "food" -> 
                {
                    if(!supplies.addFood(cnt))
                    {
                        System.out.println("You do not have enough food");
                        keepShopping = false;
                    }
                }
                case "bullet", "bullets" -> 
                {
                    if(!supplies.addBullets(cnt))
                    {
                        System.out.println("You do not have enough food");
                        keepShopping = false;
                    }
                }
                case "axle", "axles" -> 
                {
                    if(!supplies.addAxles(cnt))
                    {
                        System.out.println("You do not have enough food");
                        keepShopping = false;
                    }
                }
                default ->  
                {
                    System.out.println("I'm sorry but we don't carry " + item);
                    keepShopping = false;
                }

            }

        System.out.println(supplies);

        } while (keepShopping);
        input.close();
    }
}
