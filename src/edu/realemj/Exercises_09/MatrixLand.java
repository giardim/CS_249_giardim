package edu.realemj.Exercises_09;

public class MatrixLand {
    public static void main(String [] args) {
        Matrix2D m = new Matrix2D(3,3);
        System.out.println(m.getValue(0,1));

        Matrix2D m2 = new Matrix2D(new double[][] { { 1,2,3}, {4,5,6}});

        System.out.println("m:\n" + m);
        System.out.println("m2:\n" + m2);

        Matrix2D v1 = Matrix2D.makePoint2D(7,8);
        System.out.println("v1:\n" + v1);

        Matrix2D t1 = Matrix2D.makeTranslate2D(3, 2);
        System.out.println("t1:\n" + t1);
        Matrix2D t2 = Matrix2D.makeTranslate2D(-2, 1);
        Matrix2D combo = t2.multiply(t1);

        Matrix2D v2 = combo.multiply(v1);
        System.out.println("v2:\n" + v2);
    }    
}
