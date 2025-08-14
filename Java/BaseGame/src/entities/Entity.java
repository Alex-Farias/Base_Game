package entities;

import java.awt.image.BufferedImage;

public class Entity {
    private int index, indexMax;
    private int frames, framesMax;
    private int x, y, width, height;
    private SpriteSheet sprite;
    private BufferedImage[] skin;

    private boolean right, up, left, down;
    private int step, speed;

    private int life, lifeMax;

    public Entity(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
                  SpriteSheet sprite, boolean right, boolean up, boolean left, boolean down, int step,
                  int speed, int life, int lifeMax) {
        this.index = index;
        this.indexMax = indexMax;
        this.frames = frames;
        this.framesMax = framesMax;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sprite = sprite;
        this.right = right;
        this.up = up;
        this.left = left;
        this.down = down;
        this.step = step;
        this.speed = speed;
        this.life = life;
        this.lifeMax = lifeMax;
    }
}
