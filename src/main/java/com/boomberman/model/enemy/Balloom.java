package com.boomberman.model.enemy;

import com.boomberman.model.AI.LowAI;
import com.boomberman.model.sprites.Sprite;

import java.util.ArrayList;
import java.util.List;

public class Balloom extends Enemy{
    public Balloom(double x, double y) {
        super(x, y, 100, false);
        ai = new LowAI(5);
        speed = 1;

        //Initialize left animation sprites
        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.balloom_left1);
        left.add(Sprite.balloom_left2);
        left.add(Sprite.balloom_left3);

        //Initialize right animation sprites
        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.balloom_right1);
        right.add(Sprite.balloom_right2);
        right.add(Sprite.balloom_right3);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.balloom_dead);
        dead.add(Sprite.mob_dead1);
        dead.add(Sprite.mob_dead2);
        dead.add(Sprite.mob_dead3);

        //tại sao lại thêm 2 lần ??
        //thêm 1 lần không chạy
        spriteList.add(left);
        spriteList.add(right);
        spriteList.add(left);
        spriteList.add(right);
        spriteList.add(dead);
    }
}
