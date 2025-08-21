package mechanics.entities.creatures.attributes.defenses;

public class Defense {
    private int armor, magic, fire, ice, lightning, freeze, blood, poison, holy, madness, sleep, rot, death;

    public Defense(int armor, int magic, int fire, int ice, int lightning, int freeze, int blood, int poison, int holy, int madness, int sleep, int rot, int death) {
        this.armor = armor;
        this.magic = magic;
        this.fire = fire;
        this.ice = ice;
        this.lightning = lightning;
        this.freeze = freeze;
        this.blood = blood;
        this.poison = poison;
        this.holy = holy;
        this.madness = madness;
        this.sleep = sleep;
        this.rot = rot;
        this.death = death;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagic() {
        return magic;
    }

    public int getFire() {
        return fire;
    }

    public int getIce() {
        return ice;
    }

    public int getLightning() {
        return lightning;
    }

    public int getFreeze() {
        return freeze;
    }

    public int getBlood() {
        return blood;
    }

    public int getPoison() {
        return poison;
    }

    public int getHoly() {
        return holy;
    }

    public int getMadness() {
        return madness;
    }

    public int getSleep() {
        return sleep;
    }

    public int getRot() {
        return rot;
    }

    public int getDeath() {
        return death;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    public void setLightning(int lightning) {
        this.lightning = lightning;
    }

    public void setFreeze(int freeze) {
        this.freeze = freeze;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    public void setHoly(int holy) {
        this.holy = holy;
    }

    public void setMadness(int madness) {
        this.madness = madness;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public void setRot(int rot) {
        this.rot = rot;
    }

    public void setDeath(int death) {
        this.death = death;
    }
}
