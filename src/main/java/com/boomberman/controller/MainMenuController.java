package com.boomberman.controller;

import com.boomberman.view.ControlViewApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button controlButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button newGameButton;

    @FXML
    public void openControlStage(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        ControlViewApplication controlViewApplication = new ControlViewApplication();
        controlViewApplication.start(stage);
    }

    @FXML
    public void closeBbmStage(){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void newGameStage(){

    }
}