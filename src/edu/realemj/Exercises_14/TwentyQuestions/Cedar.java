package edu.realemj.Exercises_14.TwentyQuestions;

public class Cedar extends Plant 
            implements Flammable {

    public String howToIgnite() {
        return "campfire";
    }    

    public String howToBurn() {
        return "big bonfire";
    }

    public String howToBurn(double temp) {
        double toolong = 0.5*1000/temp;
        return "keep in fire for " + toolong + " hours";
    }
}
