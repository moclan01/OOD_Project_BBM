package com.boomberman.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Player {
    private Pane pane;
    private Rectangle clip;
    private final DoubleProperty xProperty;
    private int maxBombs;
    private static int life = 3;
    private static boolean activatePortal;
    private boolean increaseRadius;
    private boolean wallpass;
    private boolean flamepass;
    private boolean bombpass;

    public Player(double x, double y){
        super();
        this.xProperty = new SimpleDoubleProperty();

        maxBombs = 1;

        //Initialize animation sprites

    }

    public static void resetLife() {
        life = 3;
    }

    public static void decreaseLife() {
        --life;
    }

    public static int getLife() {
        return life;
    }

    public static boolean activatedPortal() {
        return activatePortal;
    }

//    private int maxBombs;
//    private Position position;
//    private boolean isAlive;
//    private boolean bombPlanted;
//    public static int life = 3;

//    public Player(int maxBombs, Position position, boolean isAlive) {
//        this.maxBombs = maxBombs;
//        this.position = position;
//        this.isAlive = isAlive;
//        this.bombPlanted = false;
//    }
//
//    public int getMaxBombs() {
//        return maxBombs;
//    }
//
//    public void setMaxBombs(int maxBombs) {
//        this.maxBombs = maxBombs;
//    }
//
//    public Position getPosition() {
//        return position;
//    }
//
//    public void setPosition(Position position) {
//        this.position = position;
//    }
//
//    public boolean isAlive() {
//        return isAlive;
//    }
//
//    public void setAlive(boolean isAlive) {
//        this.isAlive = isAlive;
//    }
//
//    public void move(Move move) {
//        int x = position.getX() + move.getDeltaX();
//        int y = position.getY() + move.getDeltaY();
//        this.setPosition(new Position(x, y));
//    }
//
//
//
//
//    public boolean isBombPlanted() {
//        return bombPlanted;
//    }
//
//    public enum Move {
//        UP(0, -1),
//        RIGHT(1, 0),
//        DOWN(0, 1),
//        LEFT(-1, 0);
//
//        private final int deltaX;
//        private final int deltaY;
//
//        Move(final int deltaX, final int deltaY) {
//            this.deltaX = deltaX;
//            this.deltaY = deltaY;
//        }
//
//        public int getDeltaX() {
//            return deltaX;
//        }
//
//        public int getDeltaY() {
//            return deltaY;
//        }
//    }
}
