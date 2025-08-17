package entities.creatures;

import entities.Entity;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Attribute;

public class Creature extends Entity {
    protected int step, sprint;
    protected boolean isRight, isUp, isLeft, isDown;
    protected Attribute attributes;

    public Creature(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Attribute attributes) {
        super(maxFrames, x, y, width, height, sprite);
        this.step = step;
        this.sprint = sprint;
        this.attributes = attributes;
    }

    public Creature(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint) {
        super(maxFrames, x, y, width, height, sprite);
        this.attributes = new Attribute();
    }

    public int getStep() {
        return step;
    }

    public int getSprint() {
        return sprint;
    }

    public boolean isRight() {
        return isRight;
    }

    public boolean isUp() {
        return isUp;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public boolean isDown() {
        return isDown;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setSprint(int sprint) {
        this.sprint = sprint;
    }

    public void setRight(boolean isRight) {
        this.isRight = isRight;
    }

    public void setUp(boolean isUp) {
        this.isUp = isUp;
    }

    public void setLeft(boolean isLeft) {
        this.isLeft = isLeft;
    }

    public void setDown(boolean isDown) {
        this.isDown = isDown;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }
}
