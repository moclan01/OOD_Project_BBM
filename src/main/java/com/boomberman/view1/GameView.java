package com.boomberman.view1;


import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.util.List;

public class GameView {
    private Scene scene;
    private Pane root;
    private MapView mapView;
//    private PlayerView playerView;
    private List<EnemyView> enemyViews;
    private List<BombView> bombViews;
    private Label scoreLabel;

    public GameView() {
    }

    
}