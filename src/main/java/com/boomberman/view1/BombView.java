package com.boomberman.view1;

import com.boomberman.model.Bomb;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BombView extends Application {
    private Pane gamePane;
    private Rectangle bomb;
    private Circle explosion;
    private Timeline explosionTimeline;
    Bomb bombModel;

    @Override
    public void start(Stage primaryStage) {
        // Create the game pane
        gamePane = new Pane();
        gamePane.setPrefSize(400, 400);

        // Load the bomb image

        bomb = new Rectangle(50, 50);

        // Create the explosion circle
        explosion = new Circle(500, Color.rgb(64, 224, 208));
        explosion.setOpacity(0.5);
        explosion.setVisible(false);

        // Create the explosion timeline
        explosionTimeline = new Timeline(
                new KeyFrame(Duration.seconds(2), event -> {
                    // Hide the explosion circle
                    explosion.setVisible(false);
                }));

        Scene scene = new Scene(gamePane);

        // Set up the event handler for the Space key
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                // Add the bomb to the game pane
                if (!gamePane.getChildren().contains(bomb)) {
                    gamePane.getChildren().add(bomb);
                }

                // Show the explosion circle and start the timeline
                explosion.setCenterX(bomb.getLayoutX() + bomb.getWidth() / 2);
                explosion.setCenterY(bomb.getLayoutY() + bomb.getHeight() / 2);
                explosion.setRadius(100);
                explosion.setVisible(true);
                explosionTimeline.playFromStart();
            }
        });

        // Add the bomb and explosion circle to the game pane
        gamePane.getChildren().addAll(bomb, explosion);

        // Show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
