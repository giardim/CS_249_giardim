package edu.giardim.Assign03;

import java.util.*;

public class LetterPrinter {
    
    public static void main (String [] args){
        String [] test = {"Hello, world", "goodbye"};
        LetterHead lh = new LetterHead("Michael", test, '*');
        System.out.println(lh.toString());
        
    }
}
 