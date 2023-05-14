package com.boomberman.model.bomb;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.AnimatedEntity;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Bomb extends AnimatedEntity {
   private static int bombCount;
   private boolean passedBomb;

    public Bomb(double x, double y, boolean increaseRadius) {
        super(x, y, true);
        //gán trạng thái khi đặt đặt boom
        direction = 0;
        ++bombCount;

        //thời gian bom nổ
        PauseTransition explore = new PauseTransition(Duration.millis(2000));
        //tạo vùng nổ
        explore.setOnFinished(event -> {
            clear();
            new Explore(this.getX(), this.getY(), increaseRadius);
            toRemove.add(this);
            --bombCount;
        });
        explore.play();

        //Animation
        List<Sprite> animation = new ArrayList<>();
        animation.add(Sprite.bomb);
        animation.add(Sprite.bomb_1);
        animation.add(Sprite.bomb_2);

        spriteList.add(animation);

    }
    public static int getBombCount() {
        return bombCount;
    }

    public boolean passedBomb() {
        return passedBomb;
    }

    public void setPassedBomb(boolean passedBomb) {
        this.passedBomb = passedBomb;
    }

    @Override
    public void update() {
        animate();
        render();
    }
}
