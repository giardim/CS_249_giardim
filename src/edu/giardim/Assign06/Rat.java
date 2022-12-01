package edu.giardim.Assign06;

import edu.giardim.Assign04.*;

public class Rat extends Creature{
    //Constructor
    public Rat(){
        //do nothing
    }
    public Rat (int row, int col){
        super(row, col);
    }

    @Override
    //Return the row and position of the rat
    public String toString(){
        return "Rat at " + super.getRow() + "," + super.getCol();
    }

    //Set the position of the rat
    public void draw(CharImage map){
        map.setPos(super.getRow(), super.getCol(), 'R');
    }
}
