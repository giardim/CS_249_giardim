package edu.realemj.Exercises_06;

public class Supplies {
    private int totalFood;
    private int totalBullets;
    private int totalAxles;

    public Supplies() {
        // Do nothing
    }

    public int getFood() {
        return totalFood;
    }

    public int getBullets() {
        return totalBullets;
    }

    public int getAxles() {
        return totalAxles;
    }
    
    public boolean setFood(int food) {
        if(food < 0) {        
            return false;
        }
        else {
            totalFood = food;
            return true;
        }
    }

    public boolean setBullets(int bullets) {
        if(bullets < 0) {        
            return false;
        }
        else {
            totalBullets = bullets;
            return true;
        }
    }

    public boolean setAxles(int axles) {
        if(axles < 0) {        
            return false;
        }
        else {
            totalAxles = axles;
            return true;
        }
    }

    public boolean addFood(int food) {
        boolean success = false;
        if(food >= 0) {
            totalFood += food;
            success = true;            
        }
        else {
            food = -food;
            if(totalFood >= food) {
                totalFood -= food;
                success = true;
            }            
        }
        return success;
    }

    public boolean addBullets(int bullets) {
        boolean success = false;
        if(bullets >= 0) {
            totalBullets += bullets;
            success = true;
        }
        else {
            bullets = -bullets;
            if(totalBullets >= bullets) {
                totalBullets -= bullets;
                success = true;
            }            
        }
        return success;
    }

    public boolean addAxles(int axles) {
        boolean success = false;
        if(axles >= 0) {
            totalAxles += axles;
            success = true;
        }
        else {
            axles = -axles;
            if(totalAxles >= axles) {
                totalAxles -= axles;
                success = true;
            }            
        }
        return success;
    }

    public String toString() {
        String s = "";
        s += "** SUPPLIES ***********" + "\n";
        s += "* Total food: " + totalFood + "\n";
        s += "* Total bullets: " + totalBullets + "\n";
        s += "* Total axles: " + totalAxles + "\n";
        s += "***********************" + "\n";
        return s;
    }
}
