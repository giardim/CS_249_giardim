/***********************************
 * Program that creates a 2D array and fills it
 *      with a specified character, checks its bounds,
 *      and prints it out
 * Author: Michael Giardina
 * Date: 31 OCT 2022
 * Language: Java (JDK 18)
 **********************************/

package edu.giardim.Assign04;

public class CharImage {
    //Set variables
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    private char [][] charArray;
    
    //Constructor
    public CharImage(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        clear();
    }

    //Clears the 2D array to its original values
    public void clear(){
        this.charArray = new char [rowCnt][colCnt];
        for (int i = 0; i < rowCnt; ++i){
            for (int j = 0; j < colCnt; ++j){
                charArray[i][j] = fillChar;
            }
        }
    }

    //Returns the number of rows
    public int getRowCnt(){
        return rowCnt;
    }

    //Returns the number of columns
    public int getColCnt(){
        return colCnt;
    }

    //Returns if the position is in the bounds of the array
    public boolean isValidPosition(int row, int col){
        if ((row < charArray.length && row >= 0) && (col < charArray[0].length && col >= 0)){
            return true;
        }
        return false;
    }

    //Returns the character at the specified bounds
    public char getPos(int row, int col){
        if (isValidPosition(row, col)){
            return charArray[row][col];
        }
        return ' ';
    }

    //Places the array at the specified bounds
    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col)){
            charArray[row][col] = c;
            return true;
        }
        return false;
    }

    //Returns a string of the default array
    public String toString(){
        return (rowCnt + " x " + colCnt + " CharImage (default: " + fillChar + ")");
    }

    //Returns the a string that represents the 2D array
    public String getMapString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowCnt; ++i){
            for (int j = 0; j < colCnt; ++j){
                sb.append(charArray[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}