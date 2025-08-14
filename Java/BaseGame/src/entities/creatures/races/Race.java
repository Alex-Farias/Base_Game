package entities.creatures.races;

import entities.Entity;
import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Atribute;

public class Race extends Creature {
    public Race(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Atribute atributes) {
        super(maxFrames, x, y, width, height, sprite, step, sprint, atributes);
    }

    public Race(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint) {
        super(maxFrames, x, y, width, height, sprite, step, sprint);
    }
}
