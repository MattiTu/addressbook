/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox{
 
        private final Button btnClose = new Button("Sulje");
        private final Button btnSave = new Button("Tallenna");

    public ButtonPartial(){
        btnClose.setStyle("-fx-background-color:grey");
        this.setStyle("-fx-padding:10;-fx-spacing:40;-fx-alignment:center");
        this.getChildren().add(btnClose);
        this.getChildren().add(btnSave);
        
    }
}
