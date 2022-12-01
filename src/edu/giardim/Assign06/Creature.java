package edu.giardim.Assign06;

import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable{
    //Instance variables
    private int row = 0;
    private int col = 0;

    //Constructors
    protected Creature(){
        //do nothing
    }
    protected Creature(int row, int col){
        setRow(row);
        setCol(col);
    }

    //Returns the number of rows
    public int getRow(){
        return this.row;
    }

    //Returns the number of columns
    public int getCol(){
        return this.col;
    }

    //Sets the number of rows
    public void setRow(int row){
        this.row = row;
    }
    
    //Sets the number of columns
    public void setCol(int col){
        this.col = col;
    }

    @Override
    //Loads the map
    public void load(Scanner input) throws GameFileException{
        try{
            row = input.nextInt();
            col = input.nextInt();
        } catch (Exception e){
            setRow(0);
            setCol(0);
            throw new GameFileException("Error loading Creature", e);
        }
    }

}
