package edu.giardim.Exercises_06;

public class Supplies {
    private int totalFood;
    private int totalBullets;
    private int totalAxles;

    public Supplies()
    {
        //do nothing;
    }

    public int getFood()
    {
        return totalFood;
    }

    public int getBullets()
    {
        return totalBullets;
    }

    public int getAxles()
    {
        return totalAxles;
    }

    public boolean setfood(int food)
    {
        totalFood = food;
        if (totalFood < 0)
        {
            totalFood = 0;
            return false;
        }
        else 
        {
            return true;
        }
    }
}

