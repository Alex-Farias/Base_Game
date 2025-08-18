package entities.player;

import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.attributes.Attribute;

public class Player extends Creature {
    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, Attribute attributes) {
        super(maxFrames, x, y, width, height, sprite, attributes);
    }

    public Player(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite) {
        super(maxFrames, x, y, width, height, sprite);
    }
}
