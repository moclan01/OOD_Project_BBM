package com.boomberman.model;

public class Map {
    private int width;
    private int height;
    private Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == 0 || i == width - 1 || j == height - 1) {
                    // Nếu là ô vuông ở biên thì đặt là tường
                    tiles[i][j] = new Tile(true, false, false);
                } else if (i % 2 == 0 && j % 2 == 0) {
                    // Nếu là ô vuông chẵn chẵn thì đặt là tường
                    tiles[i][j] = new Tile(true, false, false);
                } else {
                    // Ngược lại thì đặt là không có tường và có thể bị phá hủy
                    tiles[i][j] = new Tile(false, true, false);
                }
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Tile getTileAt(Position position) {
        int x = position.getX();
        int y = position.getY();
        return tiles[x][y];
    }

    public void setTileAt(Position position, Tile tile) {
        int x = position.getX();
        int y = position.getY();
        tiles[x][y] = tile;
    }

}
