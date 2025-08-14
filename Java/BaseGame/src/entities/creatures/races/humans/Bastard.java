package entities.creatures.races.humans;

import entities.Entity;
import entities.creatures.races.Race;
import graphycs.sprites.SpriteSheet;
import mechanics.atribues.Atribute;
import mechanics.atribues.defenses.Defense;

public class Bastard extends Race {
    public Bastard(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite, int step, int sprint, Atribute atributes) {
        super(maxFrames, x, y, width, height, sprite, step, sprint, atributes);
        atributes.setLife(100);
        atributes.setMana(50);
        atributes.setStamina(25);
        atributes.setDefenses(new Defense(10, 10, 10, 10, 10));
    }
}
