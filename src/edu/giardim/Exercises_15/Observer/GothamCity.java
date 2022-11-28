package edu.giardim.Exercises_15.Observer;

public class GothamCity {
    public static void main (String [] args){
        Batperson bruce = new Batperson("Batman");
        Batperson dick = new Batperson("Nightwing");
        Batperson barbra = new Batperson("Batgirl");
        Superperson clark = new Superperson("Superman");

        Batsignal signal = new Batsignal();

        signal.registerObserver(bruce);
        signal.registerObserver(dick);
        signal.registerObserver(barbra);
        signal.registerObserver(clark);

        signal.setActiveCrime("Robbery");
        signal.removeObserver(dick);
        signal.setActiveCrime("Murder");

    }
}
