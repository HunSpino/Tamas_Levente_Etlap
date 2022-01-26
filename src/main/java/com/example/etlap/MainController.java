package com.example.etlap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onHozzadasButtonClick(ActionEvent actionEvent) {
    }

    public void onModositasButtonClick(ActionEvent actionEvent) {
    }

    public void onTorlesButtonClick(ActionEvent actionEvent) {
    }
}