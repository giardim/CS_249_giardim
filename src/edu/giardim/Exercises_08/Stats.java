package edu.giardim.Exercises_08;
import java.util.*;

public class Stats {
    public static void main (String[] args){
        final int CNT = 100;
        final double MAXVAL = 78;
        double [] nums = new double[CNT];

        for (int i = 0; i < nums.length; ++i){
            nums[i] = Math.random() * MAXVAL;
        }
        
        Arrays.sort(nums);

        double ave = 0;
        for (double n : nums){
            ave += n;
        }
        ave /= CNT;
        System.out.println(ave);
    }
}
