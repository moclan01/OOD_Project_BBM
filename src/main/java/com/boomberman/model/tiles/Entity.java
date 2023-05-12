package com.boomberman.model.tiles;

import com.boomberman.controller.MainViewController;
import com.boomberman.model.bomb.ExploreDirection;
import com.boomberman.model.sprites.Sprite;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    protected double x;
    protected double y;
    public static final List<Entity> entityList = new ArrayList<>();
    public static final List<Entity> toRemove = new ArrayList<>();
    public static final List<Entity> toAdd = new ArrayList<>();
    protected int spriteIndex = 0 ;
    protected final GraphicsContext gc;

    /**
     * Initialize object.
     *
     * @param x coordinate x
     * @param y coordinate y
     * @param spawned    spawned
     */
    public Entity(double x, double y, boolean spawned) {
        this.gc = MainViewController.getGraphicContext();
        if (!spawned) {
            entityList.add(this);
            this.x = x * Sprite.getScaledSize();
            this.y = y * Sprite.getScaledSize();
        } else {
            this.x = x;
            this.y = y;
            toAdd.add(this);
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getXTile() {
        return (int) (x / Sprite.getScaledSize());
    }

    public int getYTile() {
        return (int) (y / Sprite.getScaledSize());
    }
    public abstract void render();

    public abstract void update();

    public static void updateList() {
        entityList.addAll(0, toAdd);

        entityList.removeAll(toRemove);
        for (Entity e : toRemove) {
            if(e instanceof ExploreDirection && ((ExploreDirection) e).flagged()) {
                continue;
            }
            e.clear();
        }

        toAdd.clear();
        toRemove.clear();
    }

    public void clear() {
        gc.clearRect(x, y, Sprite.getScaledSize(), Sprite.getScaledSize());
    }
}
