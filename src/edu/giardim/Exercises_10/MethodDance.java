package edu.giardim.Exercises_10;
public class MethodDance {
    private int iData = 5;
    private static int sData = 7;

    public int getInstanceData(){
        int x = iData + sData;
        x += getStaticData();
        return iData;
    }
    public static int getStaticData(){
        //Cannot: int y = sData + iData
        //Cannot use instance data or mathods in static
        return sData;
    }

    public static void main (String [] args){
        MethodDance m = new MethodDance();
        int d = m.getInstanceData();
        int s = MethodDance.getStaticData();
    }
}
