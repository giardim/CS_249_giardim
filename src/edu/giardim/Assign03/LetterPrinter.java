/***********************************
 * Program that prints a letterhead created from the
 *      Letterhead class
 * Author: Michael Giardina
 * Date: 19 OCT 2022
 * Language: Java (JDK 18)
 **********************************/

package edu.giardim.Assign03;

import java.util.*;

public class LetterPrinter {
    
    public static void main (String [] args){
        //Create scanner
        Scanner input = new Scanner(System.in);
        //Create local varibale with datatype Letterhead
        //  calling the askForLetterheadData method
        Letterhead header = askForLetterheadData(input);
        
        //Output the letterhead
        System.out.println("Your new letterhead:");
        System.out.println(header.toString());
        
    }
    public static Letterhead askForLetterheadData(Scanner input){
        //Askt the user for letterhead data
        System.out.println("Enter business name:");
        String name = input.nextLine();
        System.out.println("Enter boundary character:");
        String boundary = input.nextLine();
        char characterBoundary = boundary.charAt(0);
        String [] sloganLines = new String [4];
        System.out.println("Enter slogan (max 4 lines):");
        
        //Populate the sloganLines arrya
        for (int i = 0; i < 4; ++i){
            sloganLines[i] = input.nextLine();
        }
        
        
        //Pass the data to the Letterhead constructor and return the result
        Letterhead lh = new Letterhead(name, sloganLines, characterBoundary);
        return lh;

    }
}