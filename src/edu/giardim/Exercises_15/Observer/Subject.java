package edu.giardim.Exercises_15.Observer;

public interface Subject {
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObserver();

}