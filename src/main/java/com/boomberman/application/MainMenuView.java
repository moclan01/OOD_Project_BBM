package com.boomberman.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMenuView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuView.class.getResource("mainmenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Boomberman");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}
