package com.boomberman.model;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public class Enemy {
    private Position position;
    private boolean isAlive;
    private Random random;

    public Enemy(Position position, boolean isAlive) {
        this.position = position;
        this.isAlive = true;
        this.random = new Random();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void move(Position pos, GraphicsContext gc) {

        int deltaX = random.nextInt(3) - 1; // giá trị ngẫu nhiên từ -1 đến 1
        int deltaY = random.nextInt(3) + 1 / 2; // giá trị ngẫu nhiên từ -1 đến 1
        Position newPos = new Position(pos.getX() + deltaX, pos.getY() + deltaY);
        setPosition(newPos);
        gc.fillOval(newPos.getX(), newPos.getY(), 20, 20);
    }

}
