package mechanics.attributes.bars;

public class StatusBar {
    private int life;
    private int mana;
    private int stamina;

    public StatusBar(int life, int mana, int stamina) {
        this.life = life;
        this.mana = mana;
        this.stamina = stamina;
    }

    public int getLife() {
        return life;
    }

    public int getMana() {
        return mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
