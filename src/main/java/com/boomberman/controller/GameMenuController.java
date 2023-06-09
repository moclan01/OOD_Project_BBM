package com.boomberman.controller;

import com.boomberman.app.Bomberman;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class GameMenuController {
    @FXML
    private Button resumeButton;

    @FXML
    private  Button newGameButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button menuButton;

    @FXML
    public void resumeGame(){

    }

    @FXML
    public void newGameStage(){

    }

    @FXML
    public void openMainMenuStage(ActionEvent actionEvent) throws Exception {
        Stage stage = new Stage();
        Bomberman view = new Bomberman();
        view.start(stage);
    }

    @FXML
    public void closeBbmStage(ActionEvent event){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
