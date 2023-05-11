package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;

public class BombUp extends PowerUp{
    public BombUp(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_bombs);
        update();
    }

    @Override
    public void activatePower(Player player) {
        player.increaseMaxBombs();
    }
}
