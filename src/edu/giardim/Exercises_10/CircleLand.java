package edu.giardim.Exercises_10;

import edu.giardim.Exercises_09.Matrix2D;
import javafx.stage.StageStyle;

public class CircleLand {
    public static void main (String [] args){
        Circle c = new Circle();
        double r = c.getRadius();
        r = 10.0;
        System.out.println(c.getRadius());

        Matrix2D p = c.getCenter();
        System.out.println("Before:" + p);
        p.setValue(0, 0, 45);
        System.out.println("After: " + c.getCenter());
    }
}
