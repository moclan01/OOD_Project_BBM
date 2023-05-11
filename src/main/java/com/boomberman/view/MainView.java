package com.boomberman.view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainView extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainMenuView.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.ESCAPE){
                    Stage stage1 = new Stage();
                    GameMenuView gameMenuView = new GameMenuView();
                    try {
                        gameMenuView.start(stage1);
                    } catch (Exception e){
                        throw  new RuntimeException();
                    }
                }
            }
        });
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Boomberman");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}
