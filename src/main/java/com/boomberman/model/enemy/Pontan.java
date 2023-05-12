package com.boomberman.model.enemy;

import com.boomberman.model.AI.MediumAI;
import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;

import java.util.ArrayList;
import java.util.List;

public class Pontan extends Enemy{
    public Pontan(double x, double y, Player player) {
        super(x, y, 8000, false);
        speed = 3;
        ai = new MediumAI(player, this, 2);
        wallpass = true;

        //Initialize left animation sprites
        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.pontan_left1);
        left.add(Sprite.pontan_left2);
        left.add(Sprite.pontan_left3);

        //Initialize right animation sprites
        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.pontan_right1);
        right.add(Sprite.pontan_right2);
        right.add(Sprite.pontan_right3);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.pontan_dead);
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
