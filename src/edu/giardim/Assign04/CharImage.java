package edu.giardim.Assign04;

public class CharImage {
    private int rowCnt;
    private int colCnt;
    private char fillChar;
    char [][] charArray = new char[rowCnt][colCnt];
    
    public CharImage(int rowCnt, int colCnt, char fillChar){
        this.rowCnt = rowCnt;
        this.colCnt = colCnt;
        this.fillChar = fillChar;
        clear();
    }

    public void clear(){
        this.charArray = new char [rowCnt][colCnt];
        for (int i = 0; i < rowCnt; ++i){
            for (int j = 0; j < colCnt; ++j){
                charArray[i][j] = fillChar;
            }
        }
    }

    public int getRowCnt(){
        return rowCnt;
    }

    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){
        if ((row < charArray.length && row >= 0) && (col < charArray[0].length && col >= 0)){
            return true;
        }
        return false;
    }

    public char getPos(int row, int col){
        if (isValidPosition(row, col)){
            return charArray[row][col];
        }
        return ' ';
    }

    public boolean setPos(int row, int col, char c){
        if (isValidPosition(row, col)){
            charArray[row][col] = c;
            return true;
        }
        return false;
    }

    public String toString(){
        return (rowCnt + " x " + colCnt + " CharImage (default: " + fillChar + ")");
    }

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
