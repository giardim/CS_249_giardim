package edu.giardim.Exercises_13;

import java.io.*;
import java.util.*;
import edu.giardim.Exercises_09.Matrix2D;

public class OBJModel {
    private ArrayList<Matrix2D> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void load (String fileName) throws IOException{
        vertices.clear();
        indices.clear();

        try (
            Scanner inputFile = new Scanner(new File(fileName));
        ){
            while(inputFile.hasNextLine()){
                String line = inputFile.nextLine();
                line = line.trim();
                if (line.length() > 0){
                    Scanner tokens = new Scanner(line);
                }
            }
        }
    }

    public void save(String fileName) throws IOException{
        //v x   y   z
        //f i0, i1, i2

        try(
            PrintWriter output = new PrintWriter(new File(fileName));
        ){
            for (Matrix2D v : vertices){
                output.println("v " + v.makePoint3DString());
            }

            for (int i = 0; i < indices.size(); i += 3){
                output.println("f " + indices.get(i) + " " + indices.get(i + 1) + " " +  indices.get(i + 2));
            }
        }
    }
}
