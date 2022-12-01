package edu.giardim.Assign06;

import java.util.Scanner;

public class Book extends Item{
    //Instance variables
    private String skill = "";

    //Constructors
    public Book(){
        //do nothing
    }

    public Book(String id, int value, String skill){
        super(id, value);
        this.skill = skill;
    }

    //Returns skill 
    public String getSkill(){
        return skill;
    }

    //Sets skill
    public void setSkill(String skill){
        this.skill = skill;
    }

    //Tell the user which skill the book increased
    public void read(){
        System.out.println("Skill " + skill + " increased!");
    }

    @Override
    //Tell the user which skill the book increases
    public String toString(){
        return super.toString() + ", enhances " + skill;
    }

    @Override
    //Loads the map
    public void load(Scanner input) throws GameFileException{
        try{
            super.load(input);
            this.skill = input.next();
        } catch (Exception e){
            super.setID("");
            super.setValue(0);
            this.skill = "";
            throw new GameFileException("Error loading Book", e);
        }
    }
}
