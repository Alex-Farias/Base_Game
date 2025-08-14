package entities.player;

import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Atribute;

public class Player extends Creature {
    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Atribute atributes) {
        super(maxFrames, x, y, width, height, sprite, step, sprint, atributes);
    }

    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint) {
        super(maxFrames, x, y, width, height, sprite, step, sprint);
    }
}
