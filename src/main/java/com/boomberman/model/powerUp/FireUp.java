package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;

public class FireUp extends PowerUp{
    public FireUp(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.powerup_flames);
        update();
    }

    @Override
    public void activatePower(Player player) {
        active = true;
        player.increaseRadius(true);
    }
}
