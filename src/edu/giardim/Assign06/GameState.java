package edu.giardim.Assign06;
import edu.giardim.Assign04.*;

import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable{
    ArrayList<Loadable> loadables = new ArrayList<>();
    CharImage map = new CharImage(12, 30, '.');
    private int lines = 0;
    private String typeName;

    public Loadable createLoadable(String typeName) throws GameFileException{
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
            default->{
                throw new GameFileException("Unknown type: " + typeName);
            }
        }
    }

    public void load (Scanner input) throws GameFileException{
        map.clear();
        loadables.clear();
        lines = input.nextInt();
        for (int i = 0; i < lines; ++i){
            typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadables.add(m);
            if (m instanceof Drawable d){
                d.draw(map);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n" + map.getMapString() + "\nCREATURES:\n");
        for (int i = 0; i < loadables.size(); ++i){
            if (loadables.get(i) instanceof Creature c){
                sb.append(c + "\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (int i = 0; i < loadables.size(); ++i){
            if (loadables.get(i) instanceof Item x){
                sb.append(x + "\n");
            }
        }
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

