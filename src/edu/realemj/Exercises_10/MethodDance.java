package edu.realemj.Exercises_10;

public class MethodDance {
    private int idata = 5;
    private static int sdata = 7;

    public int getInstanceData() {
        // Can use instance or static data/methods
        // inside instance method
        int x = idata + sdata;
        x += getStaticData();
        return x;
    }

    public static int getStaticData() {
        // CANNOT USE INSTANCE IN STATIC: int y = sdata + idata;
        return sdata;
    }

    public static void main(String [] args) {
        int s = MethodDance.getStaticData();

        MethodDance m = new MethodDance();
        int d = m.getInstanceData();

    }

    
}
