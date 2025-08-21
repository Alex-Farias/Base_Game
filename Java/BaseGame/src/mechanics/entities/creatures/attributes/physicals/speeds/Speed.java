package mechanics.entities.creatures.attributes.physicals.speeds;

public class Speed {
    private int step;
    private int speed;

    public Speed(int step, int speed) {
        this.step = step;
        this.speed = speed;
    }

    public int getStep() {
        return step;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
