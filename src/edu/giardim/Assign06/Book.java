package edu.giardim.Assign06;

import java.util.Scanner;

public class Book extends Item{
    private String skill = "";

    public Book(){
        //do nothing
    }

    public Book(String id, int value, String skill){
        super(id, value);
        this.skill = skill;
    }

    public String getSkill(){
        return skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    public void read(){
        System.out.println("Skill " + skill + " increased!");
    }

    @Override
    public String toString(){
        return super.toString() + ", enhances " + skill;
    }

    @Override
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
