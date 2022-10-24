package edu.giardim.Exercises_12;

import edu.giardim.Exercises_09.Matrix2D;

public class Shape {
    private boolean filled = false;
    private Matrix2D center = Matrix2D.makePoint2D(0, 0);

    public Shape(){
        //do nothing
    }

    public Shape (boolean filled, Matrix2D center){
        this.filled = filled;
        this.center = center;
    }

    public boolean isFilled(){
        return filled;
    }

    public Matrix2D getCenter(){
        return new Matrix2D(center);
    }

    public void setFilled(booled filled){
        this.filled = filled;
    }

    public void setCenter(Matrix2D center){
        this.center = new Matrix2D(center);
    }
}
