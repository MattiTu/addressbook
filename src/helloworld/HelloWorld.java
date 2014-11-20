/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        VBox root = new VBox();
        Label nameLabel = new Label("Nimi");
        TextField nameField = new TextField();

        Label addressLabel = new Label("Osoite");
        TextField addressField = new TextField();
        
        Label phoneLabel = new Label("Puhelinnumero");
        TextField phoneField = new TextField();
//        root.getChildren().add(btn);
        
        //Do layout for txtfield components
        VBox textFieldLayout = new VBox();
        textFieldLayout.setStyle("-fx-padding:10 20 10 20");
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);

        Button btnClose = new Button("Sulje");
        btnClose.setStyle("-fx-background-color:grey");
        Button btnSave = new Button("Tallenna");
        HBox buttonLayout = new HBox();
        buttonLayout.setStyle("-fx-padding:10;-fx-spacing:40;-fx-alignment:center");
        buttonLayout.getChildren().add(btnClose);
        buttonLayout.getChildren().add(btnSave);
        
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        
        Scene scene = new Scene(root, 300, 250);
        

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
