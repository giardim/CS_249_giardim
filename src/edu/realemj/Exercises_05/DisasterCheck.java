package edu.realemj.Exercises_05;

public class DisasterCheck {
    public static void main(String [] args) {
        Disaster d = Disaster.LOST_FOOD;

        switch(d) {
            case CHOLERA, DYSENTERY -> System.out.println("You are sick!");
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN ->
                System.out.println("Wagon stuck!");
            case LOST_FOOD -> {
                System.out.println("We're going to starve!");
                System.out.println("What shall become of us?");
            }
            default -> System.out.println("All good!");
        }

        int totalFood = 100;
        String statusReport = switch(d) {
            case CHOLERA, DYSENTERY -> "ILLNESS!";
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN -> "EQUIPMENT FAILURE!";
            case LOST_FOOD -> {
                totalFood -= 10;
                yield "FOOD LOSS!";
            }
            default -> "EVERYTHING OK!";
        };

        System.out.println("Total food: " + totalFood);
        System.out.println("STATUS: " + statusReport);
    }
    
}
