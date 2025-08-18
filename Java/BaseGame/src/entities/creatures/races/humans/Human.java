package entities.creatures.races.humans;

import entities.creatures.Creature;
import graphycs.sprites.SpriteSheet;
import mechanics.attributes.Attribute;
import mechanics.attributes.bars.StatusBar;
import mechanics.attributes.defenses.Defense;
import mechanics.attributes.mentals.Mental;
import mechanics.attributes.physicals.Physical;
import mechanics.attributes.physicals.speeds.Speed;
import mechanics.attributes.socials.Socials;

public class Human {
    public Creature Bastard(int maxFrames, int x, int y, int width, int height, SpriteSheet sprite) {
        Attribute attributes = new Attribute();
        attributes.setBars(new StatusBar(
                100,
                50,
                25)
        );
        attributes.setDefenses(new Defense(
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10,
                10)
        );
        attributes.setPhysical(new Physical(
                10,
                10,
                10,
                10,
                new Speed(
                        1,
                        2)
                )
        );
        attributes.setMental(new Mental(
                10,
                10,
                10,
                10,
                10,
                10,
                10)
        );
        attributes.setSocials(new Socials(
                10,
                10,
                10)
        );

        return new Creature(
                maxFrames,
                x,
                y,
                width,
                height,
                sprite,
                attributes
        );
    }
}
