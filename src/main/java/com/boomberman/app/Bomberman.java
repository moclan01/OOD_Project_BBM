package com.boomberman.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Bomberman extends Application {
    private static Scene scene;

    public static Scene getScene() {
        return scene;
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Bomberman.class.getResource("mainmenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Boomberman");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}
