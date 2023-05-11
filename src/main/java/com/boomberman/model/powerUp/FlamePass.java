package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;
import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;


public class FlamePass extends PowerUp{

    public FlamePass(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_flamepass);
    }

    @Override
    public void activatePower(Player player) {
        player.setFlamepass(true);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> player.setFlamepass(false));
            }
        };
        timer.schedule(task, 15000);
    }
}
