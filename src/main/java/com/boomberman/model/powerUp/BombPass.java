package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;
import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;

public class BombPass extends PowerUp{
    public BombPass(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_bombpass);
    }

    @Override
    public void activatePower(Player player) {
        player.setBombpass(true);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> player.setBombpass(false));
            }
        };
        timer.schedule(task, 15000);
    }
}
