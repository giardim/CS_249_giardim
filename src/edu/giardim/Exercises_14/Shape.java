package edu.giardim.Exercises_14;

import edu.giardim.Exercises_09.Matrix2D;

public abstract class Shape {
    protected boolean filled = false;
    private Matrix2D center = Matrix2D.makePoint2D(0, 0);

    protected Shape(){
        //do nothing
    }

    protected Shape (boolean filled, Matrix2D center){
        this.filled = filled;
        this.center = center;
    }

    public boolean isFilled(){
        return filled;
    }

    public Matrix2D getCenter(){
        return new Matrix2D(center);
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public void setCenter(Matrix2D center){
        this.center = new Matrix2D(center);
    }

    public String toString(){
        String s = "";
        s += center.toCoordString();
        s += ", ";
        if (filled){
            s += "filled";
        }
        else {
            s += "empty";
        }
        return s;
    }

    public static String getNameOfShape(){
        return "Generic shape";
    }

    public abstract double getArea();

    @Override
    public boolean equals (Object other){
        boolean isEqual = false;

        if (other instanceof Shape os){
            if (filled == os.filled && center.equals(os.center)){
                isEqual = true;
            }
        }
        return isEqual;
    }
}
