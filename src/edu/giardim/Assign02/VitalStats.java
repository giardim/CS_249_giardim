package edu.giardim.Assign02;
import java.util.*;

public class VitalStats {
    static public void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String fName = input.next();
        String lName = input.next();
        System.out.println("Enter height in inches:");
        int height = input.nextInt();
        int ft = height / 12;
        int inches = height % 12;
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        int bmi = (int)((703 * weight) / (height * height));
        System.out.println("NAME: " + lName + ", " + fName);
        System.out.println("WEIGHT: " + weight + " lbs.");
        System.out.println("HEIGHT: " + ft + "'-" + inches + "\"");
        System.out.println("BMI: " + bmi);
        input.close();
    }  
}
