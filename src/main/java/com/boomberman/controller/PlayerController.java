package com.boomberman.controller;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class PlayerController {
    public static boolean move;
    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;
    public static boolean bomb;

    public void handle(Scene scene) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP :
                        up = true;
                    case DOWN :
                        down = true;
                    case LEFT :
                        left = true;
                    case RIGHT :
                        right = true;
                    case SPACE :
                        bomb = true;
                }
                if (up || down || left || right) {
                    move = true;
                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP :
                        up = false;
                    case DOWN :
                        down = false;
                    case LEFT :
                        left = false;
                    case RIGHT :
                        right = false;
                    case SPACE :
                        bomb = false;
                }
                if (!up && !down && !left && !right) {
                    move = false;
                }
            }
        });
    }
}
