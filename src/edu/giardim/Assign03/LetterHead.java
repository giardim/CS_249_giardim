/***********************************
 * Program that creates a letter head for
 *      a bussiness, prints name and their slogan
 * Author: Michael Giardina
 * Date: 19 OCT 2022
 * Language: Java (JDK 18)
 **********************************/

package edu.giardim.Assign03;

public class Letterhead {
    //Member variables
    private String name;
    private String [] sloganLines = new String[4];
    private char boundaryChar;

    //Constructor
    public Letterhead (String name, String [] sloganLines, char boundaryChar){
        //Set the member variables
        setName(name);
        setBoundaryChar(boundaryChar);
        setSlogan(sloganLines);
    }

    //Getter functions (Mutator functions)
    public String getName(){
        return name;
    }

    public String getSlogan(){
        StringBuilder sb = new StringBuilder();
        for (String s : sloganLines){
            if (s != null){
                sb.append(s);
                sb.append("\n");
            }else{
                sb.append("");
            } 
        }
        String slogan = sb.toString();
        return slogan;
    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    //Setter functions (access functions)
    public void setName(String name){
        this.name = name;
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setSlogan(String [] sloganLines){
        for (int i = 0; i < sloganLines.length; ++i){
            if (sloganLines[i] == null){
                this.sloganLines[i] = "";
            }
            else{
                this.sloganLines[i] = sloganLines[i];
            } 
        }
    }

    //Convert array of characters to string
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        //Padding will be needed to ensure the header is properly sized
        int padding = 0;

        //Print the top of the header
        for (int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }

        //Print the name
        sb.append("\n" + boundaryChar + " " + name);
        
        //Find the padding for the name
        padding = 38 - name.length();

        //Added spaces for the padding
        for (int i = 0; i < padding - 1; ++i){
            sb.append(" ");
        }
        sb.append(boundaryChar + "\n" + boundaryChar);
        for (int i = 0; i < 38; ++i){
            sb.append(" ");
        }
        
        //Print the slogans
        sb.append(boundaryChar + "\n");
        for (int i = 0; i < 4; ++i){
            sb.append(boundaryChar);
            if (sloganLines[i] == null){
                sb.append("");
                padding = 38;
            }else{
                sb.append(" " + sloganLines[i]);
                padding = 37 - sloganLines[i].length();
            }
            for (int j = 0; j < padding; ++j){
                sb.append(" ");
            }
            sb.append(boundaryChar);
            sb.append("\n");
        }
        for (int i = 0; i < 40; ++i){
            sb.append(boundaryChar);
        }
        sb.append("\n");

        //Build and return the letter
        String letter = sb.toString();
        return letter;
    }    
}