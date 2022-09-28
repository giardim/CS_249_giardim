/***********************************
 * Program that takes in the name, height
 *      and weight of the user to find their 
 *      BMI
 * Author: Michael Giardina
 * Date: 28 SEP 2022
 * Language: Java (JDK 18)
 **********************************/
package edu.giardim.Assign02;
import java.util.*;

public class VitalStats {
    static public void main (String [] args){
        //Create a scanner to get input from user
        Scanner input = new Scanner(System.in);
        //Ask the user for their name
        System.out.println("Enter name:");
        //Store their name in two variables, 
        //  one for first name, one for last name
        String fName = input.next();
        String lName = input.next();
        //Ask the user for their height in inches
        System.out.println("Enter height in inches:");
        //Store in variable height
        int height = input.nextInt();
        //Divide height in inches by 12 to get the feet
        int ft = height / 12;
        //Take the mod of height in inches by 12 to get the inches
        int inches = height % 12;
        //Ask the user for their weight in pounds
        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        //Calculate the BMI (703 * weight) / (height in inches ^ 2)
        //  this will be a double so we must cast it to int value
        int bmi = (int)((703 * weight) / (height * height));
        //Tell the user their info
        System.out.println("NAME: " + lName + ", " + fName);
        System.out.printf("WEIGHT: %.1f lbs.\n" , weight);
        System.out.println("HEIGHT: " + ft + "'-" + inches + "\"");
        System.out.println("BMI: " + bmi);
        //Close the input function
        input.close();
    }  
}
