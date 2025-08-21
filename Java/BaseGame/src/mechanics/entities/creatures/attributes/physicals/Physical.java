package mechanics.entities.creatures.attributes.physicals;

import mechanics.entities.creatures.attributes.physicals.speeds.Speed;

public class Physical {
    private int vigor;
    private int strength;
    private int dexterity;
    private int constitution;
    private Speed speed;

    public Physical(int vigor, int strength, int dexterity, int constitution, Speed speed) {
        this.vigor = vigor;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.speed = speed;
    }

    public int getVigor() {
        return vigor;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
