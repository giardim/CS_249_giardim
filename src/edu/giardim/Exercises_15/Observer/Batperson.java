package edu.giardim.Exercises_15.Observer;

public class Batperson implements Observer{
    private String name = "";

    public Batperson (String name){
        this.name = name;
    }

    @Override
    public void update(Subject s){
        if (s instanceof Batsignal b){
            String crime = b.getActiveCrime();
            System.out.println("This is " + name + " responding to " + crime);
        }
    }
}
