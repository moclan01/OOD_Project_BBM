package com.boomberman.model.bomb;

import com.boomberman.model.tiles.AnimatedEntity;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

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


    }
}
