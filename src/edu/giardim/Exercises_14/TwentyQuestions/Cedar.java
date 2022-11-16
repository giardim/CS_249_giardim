package edu.giardim.Exercises_14.TwentyQuestions;

public class Cedar extends Plant implements Flammable{
    public String howToIgnite(){
        return "campfire";
    }

    public String howToBurn(){
        return "Keep on bonfire too long";
    }

    public String howToBurn (double temp){
        double tooLong = .5*300/temp;
        return "keep on bonfire for " + tooLong + " hours";
    }
}
