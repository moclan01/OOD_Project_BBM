package com.boomberman.controller;

import com.boomberman.test.ControlViewApplication;
import com.boomberman.app.Bomberman;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
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
    private Pane mainMenu;
    @FXML
    public void newGameStage() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Bomberman.class.getResource("main-view.fxml"));
        mainMenu.getChildren().setAll((Pane)fxmlLoader.load());
    }

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



}