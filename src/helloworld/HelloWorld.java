/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
// Peritään Application-luokka
public class HelloWorld extends Application {

    
    
    @Override
    public void start(Stage primaryStage) {


        
        
        
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
        
        
        //The root is the main layout
        HBox root = new HBox();      
        VBox leftLayout = new VBox();      
        root.setStyle("-fx-padding:10");

        TextArea users = new TextArea();
        users.setStyle("-fx-max-width:200;-fx-max-height:200;-fx-spacing:10");

        TextFieldsPartial partial = new TextFieldsPartial();
        leftLayout.getChildren().add(partial);
        leftLayout.getChildren().add(new ButtonPartial(users,partial));
        
        root.getChildren().add(leftLayout);
        root.getChildren().add(users);        
//        Scene scene = new Scene(root, 450, 400);
        Scene scene = new Scene(root);
        

        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
