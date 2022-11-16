package edu.giardim.Exercises_14.TwentyQuestions;

public class Apple extends Fruit implements Edible, Flammable{

    public String howToEat(){
        return "apple pie";
    }

    public String howToIgnite(){
        return "Stove";
    }

    public String howToBurn(){
        return "Keep in stove too long";
    }

    public String howToBurn (double temp){
        double tooLong = 5*300/temp;
        return "keep in oven for " + tooLong + " hours";
    }
    
}
