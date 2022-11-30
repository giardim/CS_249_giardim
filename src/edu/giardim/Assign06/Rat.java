package edu.giardim.Assign06;

import edu.giardim.Assign04.*;

public class Rat extends Creature{
    public Rat(){
        //do nothing
    }
    public Rat (int row, int col){
        super(row, col);
    }

    @Override
    public String toString(){
        return "Rat at " + super.getRow() + "," + super.getCol();
    }

    public void draw(CharImage map){
        map.setPos(super.getRow(), super.getCol(), 'R');
    }
}
