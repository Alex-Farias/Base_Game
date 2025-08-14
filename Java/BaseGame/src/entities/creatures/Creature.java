package entities.creatures;

import entities.Entity;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Atribute;

public class Creature extends Entity {
    protected int step, sprint;
    protected boolean right, up, left, down;
    protected Atribute atributes;

    public Creature(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Atribute atributes) {
        super(maxFrames, x, y, width, height, sprite);
        this.step = step;
        this.sprint = sprint;
        this.atributes = atributes;
    }

    public Creature(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint) {
        super(maxFrames, x, y, width, height, sprite);
        this.atributes = new Atribute();
    }

    public int getStep() {
        return step;
    }

    public int getSprint() {
        return sprint;
    }

    public Atribute getAtributes() {
        return atributes;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setSprint(int sprint) {
        this.sprint = sprint;
    }

    public void setAtributes(Atribute atributes) {
        this.atributes = atributes;
    }
}
