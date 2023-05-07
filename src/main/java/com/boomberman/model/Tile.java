package com.boomberman.model;

public class Tile {
    private boolean wall;
    private boolean destructible;
    private boolean containsPowerUp;
    private int powerUp;

    public Tile(boolean wall, boolean destructible, boolean containsPowerUp) {
        this.wall = wall;
        this.destructible = destructible;
        this.containsPowerUp = containsPowerUp;
    }

    public boolean isWall() {
        return wall;
    }

    public boolean isDestructible() {
        return destructible;
    }

    public boolean containsPowerUp() {
        return containsPowerUp;
    }

    public void setPowerUp(int powerUp) {
        this.powerUp = powerUp;
    }

    public int getPowerUp() {
        return powerUp;
    }

}
