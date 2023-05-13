package com.boomberman.controller;

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

    public static GraphicsContext getGcBanner() {
        return gcInformationPane;
    }
    @FXML
    private void initialize(){
        gc = canvas.getGraphicsContext2D();
        gcInformationPane = informationPane.getGraphicsContext2D();
        staticPane = mainPane;
    }
}
