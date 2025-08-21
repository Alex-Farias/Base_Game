package entities;

import graphycs.runnable.Runnable;
import mechanics.entities.dimensions.Dimension;
import mechanics.entities.positions.Position;
import mechanics.entities.sprites.SpriteSheet;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Entity implements Runnable {
    private Position position;
    private Dimension dimension;
    private SpriteSheet sprite;
    private BufferedImage[] skin;

    public Entity(Position position, Dimension dimension, SpriteSheet sprite) {
        this.position = position;
        this.dimension = dimension;
        this.sprite = sprite;
    }

    public Position getPosition() {
        return position;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public SpriteSheet getSprite() {
        return sprite;
    }

    public BufferedImage[] getSkin() {
        return skin;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setSprite(SpriteSheet sprite) {
        this.sprite = sprite;
    }

    public void setSkin(BufferedImage[] skin) {
        this.skin = skin;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }
}
