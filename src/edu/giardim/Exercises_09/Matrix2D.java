package edu.giardim.Exercises_09;

public class Matrix2D {
    private double [][] data;

    public Matrix2D(int rows, int cols){
        data = new double[rows][cols];
    }

    public boolean isInBounds(int r, int c)
    {
        return ((r < data.length && r >= 0) && (c < data[r].length && c >= 0))
    }

    public void setValue(int r, int c, double val){
        if ((isInBounds(r,c))){
            data[r][c] = val;
        }
    }

    public double getValue(int r, int c){
        if (isInBounds(r, c)){
            return data[r][c];
        }
        else {
            return 0;
        }
    }

}
