package com.boomberman.model.bomb;

import com.boomberman.model.sprites.Sprite;

public class Explore  {
    public Explore(double x, double y, boolean increaseRadius) {
        int tileSize = Sprite.getScaledSize();

        //tọa độ cho các hiệu ứng vùng boom nổ
        new ExploreDirection(x,y,0);
        ExploreDirection left = new ExploreDirection(x-tileSize,y,1);
        ExploreDirection right = new ExploreDirection(x+tileSize,y,1);
        ExploreDirection up = new ExploreDirection(x,y-tileSize,2);
        ExploreDirection down = new ExploreDirection(x,y+tileSize,2);

        if (increaseRadius) {
            if (left.flagged2()) {
                new ExploreDirection(x - 2 * tileSize, y, 3);
            }
            if (right.flagged2()) {
                new ExploreDirection(x + 2 * tileSize, y, 4);
            }
            if (up.flagged2()) {
                new ExploreDirection(x, y - 2 * tileSize, 5);
            }
            if (down.flagged2()) {
                new ExploreDirection(x, y + 2 * tileSize, 6);
            }
        }
    }
}
