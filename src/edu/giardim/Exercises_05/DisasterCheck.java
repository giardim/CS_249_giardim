package edu.giardim.Exercises_05;

public class DisasterCheck {
    static public void main (String [] args)
    {
        Disaster d = Disaster.LOST_FOOD;

        switch(d)
        {
            case CHOLERA, DYSENTERY -> System.out.println("You are sick");
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN ->
                System.out.println("Wagon stuck");
            case LOST_FOOD ->
            {
                System.out.println("We are going to starve!");
                System.out.println("What shall become of us?");
            }
            default -> System.out.println("All good!");
        }

        int totalFood = 100;
        String statusReport = switch(d)
        {
            case CHOLERA, DYSENTERY -> "ILLNESS!";
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> "EQUIPMENT FAILURE!";
            case LOST_FOOD ->
            {
                totalFood -= 10;
                yield "FOOD LOSS!";
            }
            default -> "EVERYTHING OK";
        };
        System.out.println("Total food: "+ totalFood);
        System.out.println("Status: " + statusReport);
    }
}