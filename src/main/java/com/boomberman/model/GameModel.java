package com.boomberman.model;

import java.util.List;

public class GameModel {
    private int score;
    private int remainingEnemies;
    private boolean gameOver;
    private Player player;
    private List<Enemy> enemies;
    private Map map;
    private List<Bomb> bombs;

    Bomb bomb;

    public GameModel() {
        // Initialize game state here
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRemainingEnemies() {
        return remainingEnemies;
    }

    public void setRemainingEnemies(int remainingEnemies) {
        this.remainingEnemies = remainingEnemies;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(List<Bomb> bombs) {
        this.bombs = bombs;
    }

    public void updateGameState() {
        // Update the state of the game here
    }

    public void update(long currentTime) {
    }

    public Object getState() {
        return null;
    }

    public void actionGame(int i) {
        if (i == 1) {
            player.move(Player.Move.UP);
        }
        if (i == 2) {
            player.move(Player.Move.DOWN);
        }
        if (i == 3) {
            player.move(Player.Move.LEFT);
        }
        if (i == 4) {
            player.move(Player.Move.RIGHT);
        }

    }

    public void placeBomb() {
        bomb.placeBomb();
    }

}
