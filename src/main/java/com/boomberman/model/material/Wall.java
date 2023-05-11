package com.boomberman.model.material;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.Tiles;

public class Wall extends Tiles {
    public Wall(double x, double y) {
        super(x, y);
        spritesList.add(Sprite.wall);
        update();
    }
}
