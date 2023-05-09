package com.boomberman.controller;

import com.boomberman.view.GameMenuView;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainViewController {
    @FXML
    private Canvas informationPane;

    @FXML
    private Canvas canvas;

    @FXML
    private Pane mainPane;

    private static Pane staticPane;
    private static GraphicsContext gc;
    private static GraphicsContext gcBanner;

    public static Pane getPane() {
        return staticPane;
    }

    public static GraphicsContext getGraphicContext() {
        return gc;
    }

    public static GraphicsContext getGcBanner() {
        return gcBanner;
    }
    @FXML
    private void initialize(){
        gc = canvas.getGraphicsContext2D();
        gcBanner = informationPane.getGraphicsContext2D();
        staticPane = mainPane;
    }
}
