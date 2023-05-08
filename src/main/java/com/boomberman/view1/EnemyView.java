package com.boomberman.view1;

import com.boomberman.model.enemy.Enemy;
import com.boomberman.model.Position;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemyView extends Application {
    private List<Enemy> enemies;
    private Random random;
    private AnimationTimer animationTimer;
    private Canvas canvas;
    private GraphicsContext gc;

    public EnemyView() {
    }

    public EnemyView(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
        enemies = new ArrayList<>();
        random = new Random();
        animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                moveEnemies();
            }
        };
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void start() {
        animationTimer.start();
    }

    public void stop() {
        animationTimer.stop();
    }

    private void moveEnemies() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // xóa màn hình trước khi vẽ lại
        gc.setFill(Color.RED);
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                Position currentPosition = enemy.getPosition();
                enemy.move(currentPosition, gc);
                gc.fillRect(currentPosition.getX(), currentPosition.getY(), 20, 20);

                // tạo một newPosition mới để di chuyển Enemy
                Position newPosition = new Position(currentPosition.getX() + random.nextInt(3) - 1,
                        currentPosition.getY() + random.nextInt(3) - 1);
                if (newPosition.getX() >= 0 && newPosition.getX() <= canvas.getWidth() - 20
                        && newPosition.getY() >= 0 && newPosition.getY() <= canvas.getHeight() - 20) {
                    enemy.move(newPosition, gc);
                }
                gc.fillRect(enemy.getPosition().getX(), enemy.getPosition().getY(), 20, 20);
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(800, 600);
        EnemyView enemyView = new EnemyView(canvas);

        // Thêm các Enemy vào danh sách
        enemyView.addEnemy(new Enemy(new Position(100, 100), true));
        enemyView.addEnemy(new Enemy(new Position(200, 200), true));
        enemyView.addEnemy(new Enemy(new Position(300, 300), true));

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Bắt đầu di chuyển các Enemy
        enemyView.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
