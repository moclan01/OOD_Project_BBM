package com.boomberman.model;

import com.boomberman.model.enemy.Enemy;
import com.boomberman.model.level.Level;
import com.boomberman.model.material.Wall;
import com.boomberman.model.tiles.Entity;
import javafx.animation.AnimationTimer;

public class Game {
    private Level level;
    private boolean passedLevel;
    private boolean playerDead = false;
    private static int totalPoints;
    private boolean gimmickStarted;

    public static int getTotalPoints() {
        return totalPoints;
    }

    public static void addTotalPoints(int points) {
        totalPoints += points;
    }

    public static void resetTotalPoints() {
        totalPoints = 0;
    }

    public void start() {
        InformationPane informationPane = new InformationPane();

        AnimationTimer animation = new AnimationTimer() {
            @Override
            public void handle(long now) {
                informationPane.update();
                Entity.updateList();
                passedLevel = true;
                playerDead = true;
                for(Entity e : Entity.entityList) {
                    if (!(e instanceof Wall)) {
                        e.update();
                    }
                    if (e instanceof Enemy) {
                        passedLevel = false;
                    }
                    if (e instanceof Player) {
                        playerDead = false;
                    }
                }
                if (informationPane.timeUp() && !gimmickStarted) {
                    level.startGimmick();
                    gimmickStarted = true;
                } else if (!informationPane.timeUp()) {
                    gimmickStarted = false;
                }
                if (passedLevel && Player.activatedPortal()) {
                    level.nextLevel();
                    informationPane.startTimer();
                }
                if(playerDead) {
                    Player.decreaseLife();
                    if (Player.getLife() == 0) {
                        level.newGame();
                        informationPane.startTimer();
                    } else {
                        level.restartLevel();
                    }
                }
            }
        };

        level = new Level(animation);
        level.newGame();
    }
}
