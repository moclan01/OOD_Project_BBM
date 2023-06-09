package com.boomberman.model.level;

import com.boomberman.app.Bomberman;
import com.boomberman.model.Player;
import com.boomberman.model.enemy.*;
import com.boomberman.model.material.Brick;
import com.boomberman.model.material.Portal;
import com.boomberman.model.material.Wall;
import com.boomberman.model.powerUp.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FileLevel {
    private Player player;
    private int level;
    private static int height;
    private static int width;
    private String[] lineTiles;

    public int getLevel() {
        return level;
    }

    public void loadLevel(int level) {
        try {
            InputStream input = Bomberman.class.getResourceAsStream("level/Level" + level + ".txt");
            assert input != null;
            InputStreamReader fileReader = new InputStreamReader(input);
            BufferedReader in = new BufferedReader(fileReader);

            String data = in.readLine();
            StringTokenizer tokens = new StringTokenizer(data);

            level = Integer.parseInt(tokens.nextToken());
            height = Integer.parseInt(tokens.nextToken());
            width = Integer.parseInt(tokens.nextToken());

            lineTiles = new String[height];

            for (int i = 0; i < height; i++) {
                lineTiles[i] = in.readLine().substring(0, width);
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createEntities() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                addLevelEntity(lineTiles[i].charAt(j), j, i);
            }
        }
    }

    private void addLevelEntity(char c, int x, int y) {
        switch (c) {
            case '#' -> new Wall(x, y);
            case '*' -> new Brick(x, y);
            case 'x' -> new Portal(x, y);
            case 'p' -> player = new Player(x, y);
            case '1' -> new Balloom(x, y);
            case '2' -> new Oneal(x, y, player);
            case '3' -> new Dahl(x, y);
            case '4' -> new Minvo(x, y, player);
            case '5' -> new Kondoria(x, y, player);
            case '6' -> new Tiger(x, y);
            case 'b' -> new BombUp(x, y);
            case 'f' -> new FireUp(x, y);
            case 's' -> new Skate(x, y);
            case 'd'-> new FlamePass(x, y);
            case 'e' -> new BombPass(x, y);
            case 'w' -> new WallPass(x, y);
        }
    }

    public void gimmick() {
        for (int i = 0; i < 5; ++i) {
            new Pontan(1, 1, player);
        }
    }
}
