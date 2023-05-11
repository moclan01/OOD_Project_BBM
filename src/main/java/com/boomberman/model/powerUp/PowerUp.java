package com.boomberman.model.powerUp;

import com.boomberman.model.Player;
import com.boomberman.model.material.Brick;
import com.boomberman.model.tiles.Tiles;

public abstract class PowerUp extends Tiles {
    protected boolean canActivate;
    protected boolean active;
    public PowerUp(double x, double y) {
        super(x, y);
        new Brick(x, y);
    }

    public abstract void activatePower(Player player);


    public void setCanActivate(boolean canActivate) {
        this.canActivate = canActivate;
    }

    public boolean canActivate() {
        return canActivate;
    }
}
