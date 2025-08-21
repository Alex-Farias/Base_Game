package entities.creatures;

import entities.Entity;
import mechanics.controls.directions.Direction;
import mechanics.entities.creatures.attributes.Attribute;
import mechanics.entities.dimensions.Dimension;
import mechanics.entities.positions.Position;
import mechanics.entities.sprites.SpriteSheet;

public class Creature extends Entity {
    private Direction direction;
    private Attribute attributes;

    public Creature(Position position, Dimension dimension, SpriteSheet sprite, Direction direction, Attribute attributes) {
        super(position, dimension, sprite);
        this.direction = direction;
        this.attributes = attributes;
    }

    public Direction getDirection() {
        return direction;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }
}
