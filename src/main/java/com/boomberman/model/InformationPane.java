package com.boomberman.model;

import com.boomberman.controller.MainViewController;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class InformationPane {
    private final GraphicsContext gc;
    private final Timeline timeline;
    private final IntegerProperty timeSeconds;

    public InformationPane() {
        gc = MainViewController.getGcInformationPane();
        gc.setFill(Color.WHITE);
        gc.setTextBaseline(VPos.CENTER);

        timeSeconds = new SimpleIntegerProperty();
        timeline = new Timeline();
        startTimer();
    }

    public boolean timeUp() {
        return timeSeconds.get() == 0;
    }

    //
    public void startTimer() {
        int time = 200;
        timeSeconds.set(time);

        timeline.getKeyFrames().clear();
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(time + 1),new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();
    }

    public void update() {
        gc.clearRect(0, 0, 800, 34);
        gc.fillText("Score: " + Game.getTotalPoints(), 10, 15);
        gc.fillText("Timer: " + timeSeconds.get(), 100, 15);
        gc.fillText("Life: " + Player.getLife(), 200, 15);
    }
}
