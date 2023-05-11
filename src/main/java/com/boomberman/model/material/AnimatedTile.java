package com.boomberman.model.material;

import com.boomberman.model.tiles.AnimatedEntity;

public class AnimatedTile extends AnimatedEntity {
    public AnimatedTile(double x, double y, boolean spawned) {
        super(x, y, spawned);
        direction = 0;
    }
}
