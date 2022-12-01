package edu.realemj.Exercises_15.Singleton;

import java.util.*;

public class ConsoleReader {
    private Scanner input;
    private static ConsoleReader instance; // = new ConsoleReader();

    private ConsoleReader() {
        input = new Scanner(System.in);
    }

    public static ConsoleReader getInstance() {
        if(instance == null) {
            instance = new ConsoleReader();
        }
        return instance;
    }  
    
    public Scanner getInput() {
        return input;
    }
}
