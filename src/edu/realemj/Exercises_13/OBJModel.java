package edu.realemj.Exercises_13;

import java.util.*;
import java.io.*;
import edu.realemj.Exercises_09.Matrix2D;

public class OBJModel {
    private ArrayList<Matrix2D> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void load(String filename) throws IOException {
        vertices.clear();
        indices.clear();

        try (
            Scanner inputFile = new Scanner(new File(filename));
        ) {
            while(inputFile.hasNextLine()) {
                String line = inputFile.nextLine();
                line = line.trim();
                if(line.length() > 0) {
                    // v x y z
                    // f i0 i1 i2
                    // ? ??????
                    // vt ??????
                    Scanner tokens = new Scanner(line);

                }
            }
        }
    }

    public void save(String filename) throws IOException {
        // v x y z
        // f i0 i1 i2

        try (
            PrintWriter output = new PrintWriter(new File(filename));
        ) {
            for(Matrix2D v: vertices) {
                output.println("v " + v.makePoint3DString());
            }

            for(int i = 0; i < indices.size(); i += 3) {
                output.println("f " + indices.get(i)
                                + " " + indices.get(i+1)
                                + " " + indices.get(i+2));
            }
        }
    }    
}
