package com.boomberman.model.sprites;

import com.boomberman.view.MainMenuView;
import javafx.scene.image.Image;

import java.io.InputStream;

public class SpriteSheet {
    private final String path;
    private final int size;
    private final int[] pixels;

    public static final SpriteSheet spriteSheet = new SpriteSheet("images/classic.png",256);
    public SpriteSheet(String path, int size) {
        this.path = path;
        this.size = size;
        pixels = new int[size * size];
        load();
    }

    private void load(){
        InputStream inputStream = MainMenuView.class.getResourceAsStream(path);
        //kiểm tra đối tượng truyền vào
        if(inputStream == null){
            throw new RuntimeException("File not found: " + path);
        }
        //truyền ảnh vào
        Image image = new Image(inputStream);

        //lấy màu rgb từ image
        /*
        Trong mỗi lần lặp, phương thức getArgb() của đối tượng PixelReader được sử dụng
        để lấy giá trị màu RGB của pixel tại vị trí (x, y). Giá trị này sau đó
        được lưu trữ trong mảng pixels ở vị trí tương ứng với pixel đó.
         */
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                pixels[j + i * size] = image.getPixelReader().getArgb(j,i);
            }
        }
    }

    public int[] getPixels() {
        return pixels;
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }
}
