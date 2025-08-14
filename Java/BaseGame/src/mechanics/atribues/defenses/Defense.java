package mechanics.atribues.defenses;

public class Defense {
    private int armor, magic, fire, ice, lightining;

    public Defense(int armor, int magic, int fire, int ice, int lightining) {
        this.armor = armor;
        this.magic = magic;
        this.fire = fire;
        this.ice = ice;
        this.lightining = lightining;
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

    public int getLightining() {
        return lightining;
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

    public void setLightining(int lightining) {
        this.lightining = lightining;
    }
}
