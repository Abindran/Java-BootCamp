package com.example.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onButtonTapped(ActionEvent e){
        if (e.getSource().equals(captain)){
            System.out.println("Captain is clicked by: "+ textfieldone.getText());
        }else if (e.getSource().equals(hulk)){
            System.out.println("Hulk is clicked by: "+ textfieldone.getText());
        }else if (e.getSource().equals(thor)){
            System.out.println("Thor is clicked by: "+ textfieldone.getText());
        }else if (e.getSource().equals(ironman)){
            System.out.println("Iron man is clicked by: "+ textfieldone.getText());
        }
    }
    @FXML
    private Button captain;
    @FXML
    private Button hulk;
    @FXML
    private Button ironman;
    @FXML
    private Button thor;

    @FXML
    private TextField textfieldone;
}