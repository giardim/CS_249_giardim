package edu.realemj.Exercises_11;

public class Person {
    private String name;
    private boolean alive = true;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void kill() {
        alive = false;
    }
    
    public String toString() {
        return name;
    }
}
