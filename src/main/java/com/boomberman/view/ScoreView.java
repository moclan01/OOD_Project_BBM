package com.boomberman.view;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ScoreView extends HBox {
    private Label nameLabel;
    private Label scoreLabel;

    public ScoreView(String name) {
        nameLabel = new Label(name);
        scoreLabel = new Label("Score: 0");

        getChildren().addAll(nameLabel, scoreLabel);
    }

    public void setScore(int score) {
        scoreLabel.setText("Score: " + score);
    }
}

