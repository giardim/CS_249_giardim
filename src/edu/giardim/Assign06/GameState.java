package edu.giardim.Assign06;
import edu.giardim.Assign04.*;

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable{
    //Instance variables
    ArrayList<Loadable> loadables = new ArrayList<>();
    CharImage map = new CharImage(12, 30, '.');
    private int lines = 0;
    private String typeName;

    public Loadable createLoadable(String typeName) throws GameFileException{
        //Switch case returning the loadable
        //Make sure it is either a skeleton, rat, item or book
        switch (typeName){
            case "Skeleton" ->{
                return new Skeleton();
            }
            case "Rat" ->{
                return new Rat();
            }
            case "Item" ->{
                return new Item();
            }
            case "Book" ->{
                return new Book();
            }
            //If not any of the choices above throw an exception
            default->{
                throw new GameFileException("Unknown type: " + typeName);
            }
        }
    }

    public void load (Scanner input) throws GameFileException{
        //Clear the map and loadables ArrayList
        map.clear();
        loadables.clear();

        //Store the number of lines, this will be the number of times the
        //for loop will be executed
        lines = input.nextInt();
        for (int i = 0; i < lines; ++i){
            //store the typename and pass it to the createLoadable method
            typeName = input.next();
            Loadable m = createLoadable(typeName);
            //Load m
            m.load(input);
            //add m to the ArrayList
            loadables.add(m);
            if (m instanceof Drawable d){
                //If m is a drawable, draw it
                d.draw(map);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        //Add "MAP" "CREATURES" and the map to a string
        sb.append("MAP:\n" + map.getMapString() + "\nCREATURES:\n");
        for (int i = 0; i < loadables.size(); ++i){
            if (loadables.get(i) instanceof Creature c){
                //If the object in the ArrayList is a creature, add that to the
                //String too
                sb.append(c + "\n");
            }
        }
        //Add "INVENTORY" to the string
        sb.append("INVENTORY:\n");
        for (int i = 0; i < loadables.size(); ++i){
            if (loadables.get(i) instanceof Item x){
                //If the object is an Item add that to the string
                sb.append(x + "\n");
            }
        }
        //Return the string
        return sb.toString();
    }

    public void save(String fileName) throws GameFileException{
        try{
            PrintWriter writer = new PrintWriter(fileName);
            writer.print(this.toString());
            writer.close();
        }catch(Exception e){
            throw new GameFileException("Failed to save file!", e);
        }
    }
}

