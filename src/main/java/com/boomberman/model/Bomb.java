package com.boomberman.model;

public class Bomb {
    private int rangeExplode; // phạm vi phát nổ
    private Position position;
    private Player player;

    public Bomb(Position position, int rangeExplode) {
        // Initialize bomb state here
    }

    public int getRangeExplode() {
        return rangeExplode;
    }

    public void setRangeExplode(int rangeExplode) {
        this.rangeExplode = rangeExplode;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int timeToExplode() {
        return 2;
    }

    public void explode(Position bombPosition) {

    }

    public void placeBomb() {
        Position bombPos = player.getPosition();

        this.setPosition(bombPos);
        this.explode(bombPos);

    }

}
