package edu.giardim.Assign06;

public class GameFileException extends Exception{
    //Constructors
    public GameFileException(String message){
        super(message);
    }
    public GameFileException(String message, Exception e){
        super(message, e);  
    }
}
