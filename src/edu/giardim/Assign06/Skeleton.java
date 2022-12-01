package edu.giardim.Assign06;

import edu.giardim.Assign04.*;

public class Skeleton extends Creature{
    //Constructors
    public Skeleton(){
        //do nothing
    }
    public Skeleton (int row, int col){
        super(row, col);
    }

    @Override
    //Return a string witht the position of the skeleton
    public String toString(){
        return "Skeleton at " + super.getRow() + "," + super.getCol();
    }

    //set the position of the skeleton
    public void draw(CharImage map){
        map.setPos(super.getRow(), super.getCol(), 'S');
    }
}
