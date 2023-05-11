package com.boomberman.model.material;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.Tiles;

public class Portal extends Tiles {

    private boolean canActivate;

    public Portal(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.portal);
        new Brick(x, y);
    }

    public void setCanActivate(boolean canActivate) {
        this.canActivate = canActivate;
    }

    public boolean canActivate() {
        return canActivate;
    }
}
