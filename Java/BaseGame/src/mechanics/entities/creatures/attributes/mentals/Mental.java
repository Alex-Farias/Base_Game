package mechanics.entities.creatures.attributes.mentals;

public class Mental {
    private int intelligence;
    private int mind;
    private int faith;
    private int arcane;
    private int wisdom;
    private int perception;
    private int willpower;

    public Mental(int intelligence, int mind, int faith, int arcane, int wisdom, int perception, int willpower) {
        this.intelligence = intelligence;
        this.mind = mind;
        this.faith = faith;
        this.arcane = arcane;
        this.wisdom = wisdom;
        this.perception = perception;
        this.willpower = willpower;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMind() {
        return mind;
    }

    public int getFaith() {
        return faith;
    }

    public int getArcane() {
        return arcane;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getPerception() {
        return perception;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public void setArcane(int arcane) {
        this.arcane = arcane;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }
}
