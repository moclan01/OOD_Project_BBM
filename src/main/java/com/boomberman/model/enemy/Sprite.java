package com.boomberman.model.enemy;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite {


    //Board sprites
    public static final ImageView wall = new ImageView(new Image("images/wall.PNG"));
    public static final ImageView grass = new ImageView(new Image("images/grass.PNG"));
    public static final ImageView brick = new ImageView(new Image("images/brick.png"));
    public static final ImageView portal = new ImageView(new Image("images/portal.png"));

    //move player
    public static final ImageView player_up = new ImageView(new Image("images/player_up.gif"));
    public static final ImageView player_down = new ImageView(new Image("images/player_down.gif"));
    public static final ImageView player_left = new ImageView(new Image("images/player_left.gif"));
    public static final ImageView player_right = new ImageView(new Image("images/player_right.gif"));
    public static final ImageView player_die = new ImageView(new Image("images/player_die.gif"));

    //character
    public static final ImageView enemy1_left = new ImageView(new Image("images/enemy1_left.gif"));
    public static final ImageView enemy1_right = new ImageView(new Image("images/enemy1_right.gif"));
    public static final ImageView enemy1_die = new ImageView(new Image("images/enemy1_die.gif"));

    //bomb
    public static final ImageView bomb = new ImageView(new Image("images/bomb.gif"));

    //explosive bombs
    public static final ImageView horizontal_flame = new ImageView(new Image("images/horizontal_flame.gif"));
    public static final ImageView vertical_flame = new ImageView(new Image("images/vertical_flame.gif"));
    public static final ImageView central_flame = new ImageView(new Image("images/central_flame.gif"));


    
}
