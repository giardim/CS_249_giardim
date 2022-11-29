package edu.realemj.Exercises_15.Observer;

import java.util.*;

public class Batsignal implements Subject {
    private ArrayList<Observer> followers 
        = new ArrayList<>();
    private String activeCrime = "";

    public String getActiveCrime() {
        return activeCrime;
    }

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer obs) {
        followers.add(obs);
    }   

    @Override
    public void removeObserver(Observer obs) {
        followers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: followers) {
            obs.update(this);
        }
    }    
}
