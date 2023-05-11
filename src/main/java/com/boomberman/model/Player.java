package com.boomberman.model;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.AnimatedEntity;

import java.util.ArrayList;
import java.util.List;

public class Player extends AnimatedEntity {
    public Player(double x, double y) {
        super(x, y, false);

        //Initialize up animation sprites
        List<Sprite> up = new ArrayList<>();
        up.add(Sprite.player_up);
        up.add(Sprite.player_up_1);
        up.add(Sprite.player_up_2);
        spriteList.add(up);

        //Initialize down animation sprites
        List<Sprite> down = new ArrayList<>();
        down.add(Sprite.player_down);
        down.add(Sprite.player_down_1);
        down.add(Sprite.player_down_2);
        spriteList.add(down);

        //Initialize left animation sprites
        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.player_left);
        left.add(Sprite.player_left_1);
        left.add(Sprite.player_left_2);
        spriteList.add(left);

        //Initialize right animation sprites
        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.player_right);
        right.add(Sprite.player_right_1);
        right.add(Sprite.player_right_2);
        spriteList.add(right);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.player_dead1);
        dead.add(Sprite.player_dead2);
        dead.add(Sprite.player_dead3);
        spriteList.add(dead);

    }
}
