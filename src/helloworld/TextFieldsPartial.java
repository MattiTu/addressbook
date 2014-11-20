/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldsPartial extends VBox{
    
        private final Label nameLabel = new Label("Nimi");
        private final TextField nameField = new TextField();
        private final Label addressLabel = new Label("Osoite");
        private final TextField addressField = new TextField();
        private final Label phoneLabel = new Label("Puhelinnumero");
        private final TextField phoneField = new TextField();

    public TextFieldsPartial(){
        VBox.setMargin(this, new Insets(10,20,10,20));
        //this.setStyle("-fx-padding:10 20 10 20"); //Vaihtoehtoinen tapa
        //nameLabel.setStyle("-fx-padding:10 0 0 0");
        addressLabel.setStyle("-fx-padding:10 0 0 0");
        phoneLabel.setStyle("-fx-padding:10 0 0 0");
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameField);
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressField);
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneField);
    }
    
    public UserInfo getUserInfo(){
        UserInfo info = new UserInfo();
        info.setName(nameField.getText());
        info.setAddress(addressField.getText());
        info.setPhone(phoneField.getText());
        return info;
    }
    
    public void clearFields(){
        nameField.clear();
        addressField.clear();
        phoneField.clear();
    }    
}
