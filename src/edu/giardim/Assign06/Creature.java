package edu.giardim.Assign06;

import java.util.Scanner;

public abstract class Creature implements Loadable, Drawable{
    private int row = 0;
    private int col = 0;

    protected Creature(){
        //do nothing
    }
    protected Creature(int row, int col){
        setRow(row);
        setCol(col);
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public void setRow(int row){
        this.row = row;
    }
    
    public void setCol(int col){
        this.col = col;
    }

    @Override
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
