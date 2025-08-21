package mechanics.entities.creatures.attributes;

import mechanics.entities.creatures.attributes.bars.StatusBar;
import mechanics.entities.creatures.attributes.defenses.Defense;
import mechanics.entities.creatures.attributes.mentals.Mental;
import mechanics.entities.creatures.attributes.physicals.Physical;
import mechanics.entities.creatures.attributes.physicals.speeds.Speed;
import mechanics.entities.creatures.attributes.socials.Socials;

public class Attribute {
    private StatusBar bars;
    private Defense defenses;
    private Physical physical;
    private Mental mental;
    private Socials socials;

    public Attribute(StatusBar bars, Defense defenses, Physical physical, Mental mental, Socials socials) {
        this.bars = bars;
        this.defenses = defenses;
        this.physical = physical;
        this.mental = mental;
        this.socials = socials;
    }

    public Attribute(){
        this.bars = new StatusBar(0, 0, 0);
        this.defenses = new Defense(0,0,0,0,0, 0, 0, 0, 0, 0, 0, 0, 0);
        this.physical = new Physical(0, 0, 0, 0, new Speed(0, 0));
        this.mental = new Mental(0, 0, 0, 0, 0, 0, 0);
        this.socials = new Socials(0, 0, 0);
    }

    public StatusBar getBars() {
        return bars;
    }

    public Defense getDefenses() {
        return defenses;
    }

    public Physical getPhysical() {
        return physical;
    }

    public Mental getMental() {
        return mental;
    }

    public Socials getSocials() {
        return socials;
    }

    public void setBars(StatusBar bars) {
        this.bars = bars;
    }

    public void setDefenses(Defense defenses) {
        this.defenses = defenses;
    }

    public void setPhysical(Physical physical) {
        this.physical = physical;
    }

    public void setMental(Mental mental) {
        this.mental = mental;
    }

    public void setSocials(Socials socials) {
        this.socials = socials;
    }
}
