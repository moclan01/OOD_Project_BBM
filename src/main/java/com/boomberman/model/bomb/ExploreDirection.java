package com.boomberman.model.bomb;

import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.AnimatedEntity;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class ExploreDirection extends AnimatedEntity {
    //tạo biến đánh dấu vật thể
    private boolean flag1;
    private boolean flag2;

    public ExploreDirection(double x, double y, int direction) {
        super(x, y, true);
        this.direction = direction;

        List<Sprite> explode = new ArrayList<>();
        explode.add(Sprite.bomb_exploded);
        explode.add(Sprite.bomb_exploded1);
        explode.add(Sprite.bomb_exploded2);
        spriteList.add(explode);

        List<Sprite> horizontal = new ArrayList<>();
        horizontal.add(Sprite.explosion_horizontal);
        horizontal.add(Sprite.explosion_horizontal1);
        horizontal.add(Sprite.explosion_horizontal2);
        spriteList.add(horizontal);

        List<Sprite> vertical = new ArrayList<>();
        vertical.add(Sprite.explosion_vertical);
        vertical.add(Sprite.explosion_vertical1);
        vertical.add(Sprite.explosion_vertical2);
        spriteList.add(vertical);

        List<Sprite> leftLast = new ArrayList<>();
        leftLast.add(Sprite.explosion_horizontal_left_last);
        leftLast.add(Sprite.explosion_horizontal_left_last1);
        leftLast.add(Sprite.explosion_horizontal_left_last2);
        spriteList.add(leftLast);

        List<Sprite> rightLast = new ArrayList<>();
        rightLast.add(Sprite.explosion_horizontal_right_last);
        rightLast.add(Sprite.explosion_horizontal_right_last1);
        rightLast.add(Sprite.explosion_horizontal_right_last2);
        spriteList.add(rightLast);

        List<Sprite> topLast = new ArrayList<>();
        topLast.add(Sprite.explosion_vertical_top_last);
        topLast.add(Sprite.explosion_vertical_top_last1);
        topLast.add(Sprite.explosion_vertical_top_last2);
        spriteList.add(topLast);

        List<Sprite> downLast = new ArrayList<>();
        downLast.add(Sprite.explosion_vertical_down_last);
        downLast.add(Sprite.explosion_vertical_down_last1);
        downLast.add(Sprite.explosion_vertical_down_last2);
        spriteList.add(downLast);

        PauseTransition disspear = new PauseTransition(Duration.millis(500));
        disspear.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                toRemove.add(ExploreDirection.this);
            }
        });
        disspear.play();

        update();
    }

    //xử lý sự kiện của vùng bom nổ

}
