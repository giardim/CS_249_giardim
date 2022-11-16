package edu.giardim.Exercises_14.TwentyQuestions;

public class Chicken extends Animal implements Edible, Flammable{
    @Override
    public String howToEat(){
        return "BBQ";
    }
    @Override
    public String howToIgnite(){
        return "BBQ Grill";
    }

    public String howToBurn(){
        return "Keep on grill too long";
    }

    public String howToBurn (double temp){
        double tooLong = 5*300/temp;
        return "keep on grill for " + tooLong + " hours";
    }
}
