package com.boomberman.model;

import com.boomberman.model.bomb.Bomb;
import com.boomberman.model.sprites.Sprite;
import com.boomberman.model.tiles.AnimatedEntity;
import javafx.animation.PauseTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class Player extends AnimatedEntity {
    private Pane pane;
    private Rectangle clip;
    private final DoubleProperty xProperty;
    private int maxBombs;
    private static int life = 3;
    private static boolean activatePortal;
    private boolean increaseRadius;
    private boolean wallpass;
    private boolean flamepass;
    private boolean bombpass;

    public Player(double x, double y) {
        super(x, y, false);
        this.xProperty = new SimpleDoubleProperty();
        speed = 2;
        maxBombs = 1;

        //Initialize up animation sprites
        List<Sprite> up = new ArrayList<>();
        up.add(Sprite.player_up);
        up.add(Sprite.player_up_1);
        up.add(Sprite.player_up_2);
        spriteList.add(up);

        //Initialize down animation sprites
        List<Sprite> down = new ArrayList<>();
        down.add(Sprite.player_down);
        down.add(Sprite.player_down_1);
        down.add(Sprite.player_down_2);
        spriteList.add(down);

        //Initialize left animation sprites
        List<Sprite> left = new ArrayList<>();
        left.add(Sprite.player_left);
        left.add(Sprite.player_left_1);
        left.add(Sprite.player_left_2);
        spriteList.add(left);

        //Initialize right animation sprites
        List<Sprite> right = new ArrayList<>();
        right.add(Sprite.player_right);
        right.add(Sprite.player_right_1);
        right.add(Sprite.player_right_2);
        spriteList.add(right);

        List<Sprite> dead = new ArrayList<>();
        dead.add(Sprite.player_dead1);
        dead.add(Sprite.player_dead2);
        dead.add(Sprite.player_dead3);
        spriteList.add(dead);
    }

    public static void resetLife() {
        life = 3;
    }

    public static void decreaseLife() {
        --life;
    }

    public static int getLife() {
        return life;
    }

    public static boolean activatedPortal() {
        return activatePortal;
    }
    public void increaseMaxBombs() {
        ++maxBombs;
    }

    public void increaseRadius(boolean increaseRadius) {
        this.increaseRadius = increaseRadius;
    }

    public void increaseSpeed() {
        ++speed;
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(20));
        pauseTransition.setOnFinished(event -> --speed);
        pauseTransition.play();
    }

    public void setWallpass(boolean wallpass) {
        this.wallpass = wallpass;
    }

    public void setFlamepass(boolean flamepass) {
        this.flamepass = flamepass;
    }

    public void setBombpass(boolean bombpass) {
        this.bombpass = bombpass;
    }

    public boolean canPassFlame() {
        return flamepass;
    }

    private void placeBomb() {
        double bombX = Math.round(x / Sprite.getScaledSize()) * Sprite.getScaledSize();
        double bombY = Math.round(y / Sprite.getScaledSize()) * Sprite.getScaledSize();
        new Bomb(bombX, bombY, increaseRadius);
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        //k biết làm :))
        //phần di chuyển và phần addCamera nếu được thì bỏ nó luôn

    }

    //    //chuyển lên controller
//    private double clampRange() {
//        double value = x - Bomberman.getScene().getWidth() / 2;
//        double max = pane.getWidth() - Bomberman.getScene().getWidth();
//        if (value < 0) {
//            return 0;
//        }
//        return Math.min(value, max);
//    }
//
//    @Override
//    protected void moveBy(double dx, double dy) {
//        super.moveBy(dx, dy);
//        xProperty.set(x);
//
//        Level.xProperty().bind(Bindings.createDoubleBinding(this::clampRange, xProperty));
//        clip.xProperty().bind(Bindings.createDoubleBinding(this::clampRange, xProperty, pane.widthProperty()));
//    }
//    //chuyển lên conttroller
//    private void addCamera() {
//        pane = BombermanController.getPane();
//        clip = new Rectangle();
//
//        clip.widthProperty().bind(Bomberman.getScene().widthProperty());
//        clip.heightProperty().bind(Bomberman.getScene().heightProperty());
//
//        pane.setClip(clip);
//        pane.translateXProperty().bind(clip.xProperty().multiply(-1));
//    }

//    @Override
//    public boolean collide(Entity e, double x, double y) {
//        if (wallpass && e instanceof Brick) {
//            return false;
//        }
//
//        if (flamepass && e instanceof ExplodeDirection) {
//            return false;
//        }
//
//        if (bombpass && e instanceof Bomb) {
//            return false;
//        }
//
//        boolean collide = super.collide(e, x, y);
//
//        if (e instanceof Tile) {
//            clear();
//            this.x = Math.round(this.x / Sprite.getScaledSize()) * Sprite.getScaledSize();
//            this.y = Math.round(this.y/ Sprite.getScaledSize()) * Sprite.getScaledSize();
//        }
//
//        if (collide && e instanceof Enemy) {
//            remove();
//        }
//
//        if (e instanceof Bomb && !((Bomb) e).passedBomb()) {
//            if (this.getX() <= e.getX() - Sprite.getScaledSize()
//                    || this.getX() >= e.getX() + Sprite.getScaledSize()
//                    || this.getY() <= e.getY() - Sprite.getScaledSize()
//                    || this.getY() >= e.getY() + Sprite.getScaledSize()) {
//                ((Bomb) e).setPassedBomb(true);
//                return true;
//            }
//            return false;
//        }
//
//        if (collide && e instanceof PowerUp && ((PowerUp) e).canActivate()) {
//            ((PowerUp) e).activatePower(this);
//            toRemove.add(e);
//        }
//
//        activatePortal = collide && e instanceof Portal && ((Portal) e).canActivate();
//        return collide;
//    }
//
//    @Override
//    public void update() {
//        isMoving = Control.move;
//        goUp = Control.up;
//        goDown = Control.down;
//        goLeft = Control.left;
//        goRight = Control.right;
//        if (Control.bomb && Bomb.getBombCount() < maxBombs) {
//            placeBomb();
//            Control.bomb = false;
//        }
//        super.update();
//    }
}
