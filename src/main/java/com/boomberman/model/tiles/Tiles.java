package com.boomberman.model.tiles;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.Entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Tiles extends Entity {
    protected final List<Sprite> spritesList;

    public Tiles(double x, double y) {
        super(x, y, false);
        spritesList = new ArrayList<>();
    }

    @Override
    public void update() {
        render();
    }

    @Override
    public void render() {
        gc.drawImage(spritesList.get(0).getTexture(), x, y);
    }
}
