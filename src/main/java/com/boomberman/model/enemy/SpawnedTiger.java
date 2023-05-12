package com.boomberman.model.enemy;

import com.boomberman.model.AI.LowAI;
import com.boomberman.model.sprites.Sprite;

import java.util.ArrayList;
import java.util.List;

public class SpawnedTiger extends Enemy{
    public SpawnedTiger(double x, double y) {
        super(x, y, 100, true);
        ai = new LowAI(1);
        speed = 1;

        //Initialize left animation sprites
        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.tiger_left1);
        left.add(Sprite.tiger_left2);
        left.add(Sprite.tiger_left3);

        //Initialize right animation sprites
        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.tiger_right1);
        right.add(Sprite.tiger_right2);
        right.add(Sprite.tiger_right3);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.tiger_dead);
        dead.add(Sprite.mob_dead1);
        dead.add(Sprite.mob_dead2);
        dead.add(Sprite.mob_dead3);

        spriteList.add(left);
        spriteList.add(right);
        spriteList.add(left);
        spriteList.add(right);
        spriteList.add(dead);
    }
}
