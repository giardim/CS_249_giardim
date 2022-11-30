package edu.giardim.Assign06;

import edu.giardim.Assign04.*;

public class Skeleton extends Creature{
    public Skeleton(){
        //do nothing
    }
    public Skeleton (int row, int col){
        super(row, col);
    }

    @Override
    public String toString(){
        return "Skeleton at " + super.getRow() + "," + super.getCol();
    }

    public void draw(CharImage map){
        map.setPos(super.getRow(), super.getCol(), 'S');
    }
}
