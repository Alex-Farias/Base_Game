package entities.player;

import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Attribute;

public class Player extends Creature {
    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Attribute attributes) {
        super(maxFrames, x, y, width, height, sprite, step, sprint, attributes);
    }

    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint) {
        super(maxFrames, x, y, width, height, sprite, step, sprint);
    }
}
