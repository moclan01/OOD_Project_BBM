package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;
import javafx.application.Platform;

import java.util.Timer;
import java.util.TimerTask;

public class WallPass extends PowerUp{
    public WallPass(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_wallpass);
    }

    @Override
    public void activatePower(Player player) {
        player.setWallpass(true);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> player.setWallpass(false));
            }
        };
        timer.schedule(task, 15000);
    }
}
