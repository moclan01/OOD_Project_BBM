package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;

public class Skate extends PowerUp{
    public Skate(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_speed);
        update();
    }

    @Override
    public void activatePower(Player player) {
        player.increaseSpeed();
    }
}
