package mechanics.atribues;

import mechanics.atribues.defenses.Defense;

public class Atribute {
    private int life;
    private int mana;
    private int stamina;
    private Defense defenses;

    public Atribute(int life, int mana, int stamina, Defense defenses) {
        this.life = life;
        this.mana = mana;
        this.stamina = stamina;
        this.defenses = defenses;
    }

    public Atribute(){
        this.life = 1;
        this.mana = 1;
        this.stamina = 1;
        this.defenses = new Defense(0,0,0,0,0);
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

    public Defense getDefenses() {
        return defenses;
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

    public void setDefenses(Defense defenses) {
        this.defenses = defenses;
    }
}
