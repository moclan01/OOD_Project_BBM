package com.boomberman.controller;

import com.boomberman.model.Game;
import com.boomberman.model.sprites.Sprite;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import javafx.scene.layout.Pane;


public class MainViewController {
    @FXML
    private Canvas informationPane;

    @FXML
    private Canvas canvas;

    @FXML
    private Pane mainPane;

    private static Pane staticPane;
    private static GraphicsContext gc;
    private static GraphicsContext gcInformationPane;

    public static Pane getPane() {
        return staticPane;
    }

    public static GraphicsContext getGraphicContext() {
        return gc;
    }

    public static GraphicsContext getGcInformationPane() {
        return gcInformationPane;
    }
    @FXML
    private void initialize(){
        gc = canvas.getGraphicsContext2D();
        gcInformationPane = informationPane.getGraphicsContext2D();
        staticPane = mainPane;

        Game game = new Game();

        canvas.setWidth(31 * Sprite.getScaledSize());
        canvas.setHeight(13 * Sprite.getScaledSize());

        mainPane.setStyle("-fx-background-color: #50a000");
        mainPane.setMinSize(31 * Sprite.getScaledSize(), 13 * Sprite.getScaledSize());
        mainPane.setPrefSize(31 * Sprite.getScaledSize(), 13 * Sprite.getScaledSize());
        mainPane.setMaxSize(31 * Sprite.getScaledSize(), 13 * Sprite.getScaledSize());

        game.start();
    }
}
