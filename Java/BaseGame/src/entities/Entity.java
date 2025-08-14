package entities;

import graphycs.sprites.SpriteSheet;

import java.awt.image.BufferedImage;

public class Entity {
    protected int maxFrames;
    protected int x, y, width, height;
    protected SpriteSheet sprite;
    protected BufferedImage[] skin;

    public Entity(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite) {
        this.maxFrames = maxFrames;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.sprite = sprite;
    }

    public int getMaxFrames() {
        return maxFrames;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpriteSheet getSprite() {
        return sprite;
    }

    public BufferedImage[] getSkin() {
        return skin;
    }

    public void setMaxFrames(int maxFrames) {
        this.maxFrames = maxFrames;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSprite(SpriteSheet sprite) {
        this.sprite = sprite;
    }

    public void setSkin(BufferedImage[] skin) {
        this.skin = skin;
    }
}
