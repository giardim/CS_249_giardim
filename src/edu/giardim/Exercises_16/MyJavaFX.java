package edu.giardim.Exercises_16;

import javafx.stage.Stage;
import javafx.scene.control.Button;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class MyJavaFX extends javafx.application.Application{
    private class ButtonResponder implements EventHandler<ActionEvent>{
        public void handle(ActionEvent event){
            Object obj = event.getSource();
            if (obj instanceof Button b){
                String t = b.getText();
                System.out.println("Button: " + t);
            }
        }
    }
    public void start(Stage PrimaryStage){
        Button[] allButtons = new Button[5];
        for (int i = 0; i < allButtons.length; ++i){
            allButtons[i] = new Button("" + i);
        }

        // FlowPane pane = new FlowPane();

        // for(Button b : allButtons){
        //     pane.getChildren().add(b);
        // }

        GridPane pane = new GridPane();
        pane.add(allButtons[0], 0, 0);
        pane.add(allButtons[1], 2, 0);
        pane.add(allButtons[2], 0, 2);
        pane.add(allButtons[3], 2, 2);
        pane.add(allButtons[4], 1, 1);
        

        //Regular inner class
        // ButtonResponder br = new ButtonResponder();
        // allButtons[0].setOnAction(br);
        // for (Button b : allButtons){
        //     b.setOnAction(br);
        // }

        //Anonymous inner class
        // EventHandler<ActionEvent> br = new EventHandler<ActionEvent>() {
        //     public void handle(ActionEvent event){
        //         Object obj = event.getSource();
        //         if (obj instanceof Button b){
        //             String t = b.getText();
        //             System.out.println("Button: " + t);
        //         }
        // };

        //Lamda expression
        // EventHandler<ActionEvent> br = event ->  {
            
        // };


        // BorderPane pane = new BorderPane();
        // pane.setTop(allButtons[0]);
        // pane.setBottom(allButtons[1]);
        // pane.setLeft(allButtons[2]);
        // pane.setRight(allButtons[3]);
        // pane.setCenter(allButtons[4]);
        
        
        // Button btOK = new Button("OK");
        // Scene scene = new Scene(btOK, 400, 500);

        Scene scene = new Scene(pane, 400, 500);
        
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("My JavaFx Application");
        PrimaryStage.show();
    }

    public static void main (String [] args){
        launch(args);
    }

}

// class ButtonResponder implements EventHandler<ActionEvent>{
//     public void handle(ActionEvent event){
//         Object obj = event.getSource();
//         if (obj instanceof Button b){
//             String t = b.getText();
//             System.out.println("Button: " + t);
//         }
//     }
// }
