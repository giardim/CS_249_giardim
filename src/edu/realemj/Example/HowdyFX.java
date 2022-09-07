package edu.realemj.Example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HowdyFX extends Application { 
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 400, 250);

        primaryStage.setTitle("Hello from JavaFX!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String [] args) {
        launch(args);
    }
}
