package com.boomberman.model.tiles;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Message extends Entity{
    private final String msg;

    public Message(double x, double y, String msg) {
        super(x , y, true);
        gc.setFill(Color.WHITE);
        this.msg = msg;

        PauseTransition pauseTransition = new PauseTransition(Duration.millis(400));
        pauseTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                toRemove.add(Message.this);
            }
        });
        pauseTransition.play();
    }

    //Vẽ nội dung thông báo lên màn hình tại tọa độ x, y.
    @Override
    public void render() {
        gc.fillText(msg,x,y);
    }

    //Xóa bỏ nội dung thông báo đã vẽ trước đó tại tọa độ x, y.
    @Override
    public void clear() {
        gc.clearRect(x,y,10,10);
    }

//    Gọi phương thức clear() để xóa bỏ nội dung thông báo đã vẽ trước đó.
//    Gọi phương thức render() để vẽ lại nội dung thông báo mới lên màn hình.
    @Override
    public void update() {
        clear();
        render();
    }
}
