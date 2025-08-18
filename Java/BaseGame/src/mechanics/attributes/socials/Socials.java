package mechanics.attributes.socials;

public class Socials {
    private int charisma;
    private int presence;
    private int manipulation;

    public Socials(int charisma, int presence, int manipulation) {
        this.charisma = charisma;
        this.presence = presence;
        this.manipulation = manipulation;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getPresence() {
        return presence;
    }

    public int getManipulation() {
        return manipulation;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public void setManipulation(int manipulation) {
        this.manipulation = manipulation;
    }
}
