package com.boomberman.view;

import com.boomberman.model.Map;
import com.boomberman.model.Position;
import com.boomberman.model.Tile;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class MapView extends Pane {
    private int tileSize;
    private Map map;
    private List<List<Rectangle>> tiles;

    public MapView(Map map, int tileSize) {
        this.map = map;
        this.tileSize = tileSize;
        this.tiles = new ArrayList<>();

        for (int i = 0; i < map.getWidth(); i++) {
            List<Rectangle> column = new ArrayList<>();

            for (int j = 0; j < map.getHeight(); j++) {
                Rectangle tile = new Rectangle(tileSize, tileSize);
                tile.setFill(Color.GREEN);

                column.add(tile);
                getChildren().add(tile);
            }

            tiles.add(column);
        }
    }

    public void updateTile(Position position, Tile tile) {
        int x = position.getX();
        int y = position.getY();

        Rectangle rect = tiles.get(x).get(y);

        if (tile.isWall()) {
            rect.setFill(Color.GRAY);
        } else if (tile.isDestructible()) {
            rect.setFill(Color.ORANGE);
        } else if (tile.containsPowerUp()) {
            rect.setFill(Color.BLUE);
        } else {
            rect.setFill(Color.GREEN);
        }
    }

    public void draw() {
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                updateTile(new Position(i, j), map.getTileAt(new Position(i, j)));
            }
        }
    }
}
