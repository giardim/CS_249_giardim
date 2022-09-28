package edu.realemj.Exercises_06;

import java.util.*;

public class L33t {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter line:");
        String line = "";

        do {
            line = input.nextLine();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                c = switch(c) {
                    case 'a','A' -> '4';
                    case 'e','E' -> '3';
                    case 'i','I' -> '1';
                    case 'o','O' -> '0';
                    default -> c;
                };
                sb.append(c);
            }
            System.out.println(sb);

        } while(!line.equals("")); // line.length() != 0

        input.close();
    }    
}
