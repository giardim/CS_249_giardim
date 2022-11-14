package edu.realemj.Exercises_13;

public class BunnyMadness {
    public static void main(String [] args) {
        OBJModel model = new OBJModel();

        try {
            model.load("bunny.obj");
            model.scale(1.0, 2.0, 0.5);
            model.save("bunnyStretched.obj");
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }    
}
