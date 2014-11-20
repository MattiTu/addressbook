/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
//public class ButtonPartial extends HBox{
public class ButtonPartial extends HBox implements EventHandler<ActionEvent>{
 
        private final Button closeButton = new Button("Sulje");
        private final Button saveButton = new Button("Tallenna");
        private final Button printButton = new Button("Tulosta");
        private ArrayList<UserInfo> userInfo = new ArrayList();
        private TextArea users;
        private TextFieldsPartial partial;
 
    public ButtonPartial(TextArea users, TextFieldsPartial partial){
        this.users = users;
        this.partial = partial;
        closeButton.setStyle("-fx-background-color:grey");
//        this.setStyle("-fx-padding:10;-fx-spacing:10;-fx-alignment:center");
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
//        closeButton.setOnAction(new EventHandler<ActionEvent>(){
//            
// //         @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Close painettu");
//                Platform.exit();
//            }
//        });  
    }
        
    @Override
    public void handle(ActionEvent t) 
    {
        if(t.getSource().equals(closeButton))
        {
            Platform.exit();
        }
        else if(t.getSource().equals(saveButton))
        {
            UserInfo temp = partial.getUserInfo();
            userInfo.add(temp);
            partial.clearFields();
        }
        else
        {
            for(UserInfo temp : userInfo)
            {
                users.setText(users.getText() +
                "Nimi:" + temp.getName() + "\n" +
                "Osoite:" + temp.getAddress() + "\n" +
                "Puhelin:" + temp.getPhone() + "\n\n");
            }
        }        
    }
}
