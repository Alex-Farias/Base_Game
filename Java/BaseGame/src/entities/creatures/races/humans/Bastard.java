package entities.creatures.races.humans;

import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Attribute;
import mechanics.atribues.defenses.Defense;

public class Bastard extends Creature {
    public Bastard(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Attribute attributes) {
        super(maxFrames, x, y, width, height, sprite, step, sprint, attributes);
        attributes.setLife(100);
        attributes.setMana(50);
        attributes.setStamina(25);
        attributes.setDefenses(new Defense(10, 10, 10, 10, 10));
    }
}
