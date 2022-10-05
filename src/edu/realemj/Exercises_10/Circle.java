package edu.realemj.Exercises_10;

import edu.realemj.Exercises_09.Matrix2D;

public class Circle {
    private double radius = 1.0;
    private Matrix2D pos = Matrix2D.makePoint2D(0,0);
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        if(r >= 0) {
            radius = r;
        }
    }

    public Matrix2D getCenter() {
        return new Matrix2D(pos);
    }

    public void setCenter(Matrix2D p) {
        pos = new Matrix2D(p);
    }
}
