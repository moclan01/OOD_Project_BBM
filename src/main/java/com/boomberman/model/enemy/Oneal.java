package com.boomberman.model.enemy;

import com.boomberman.model.AI.MediumAI;
import com.boomberman.model.Player;
import com.boomberman.model.sprites.Sprite;

import java.util.ArrayList;
import java.util.List;

public class Oneal extends Enemy{
    public Oneal(double x, double y, Player player) {
        super(x, y, 200, false);
        speed = 2;

        ai = new MediumAI(player, this, 1);

        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.oneal_left1);
        left.add(Sprite.oneal_left2);
        left.add(Sprite.oneal_left3);

        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.oneal_right1);
        right.add(Sprite.oneal_right2);
        right.add(Sprite.oneal_right3);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.oneal_dead);
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
