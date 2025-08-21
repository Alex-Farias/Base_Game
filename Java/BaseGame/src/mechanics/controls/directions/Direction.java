package mechanics.controls.directions;

public class Direction {
    private boolean isUp, isDown, isLeft, isRight;

    public Direction() {
        this.isUp = false;
        this.isDown = false;
        this.isLeft = false;
        this.isRight = false;
    }

    public boolean isUp() {
        return isUp;
    }

    public boolean isDown() {
        return isDown;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setUp(boolean up) {
        isUp = up;
    }

    public void setDown(boolean down) {
        isDown = down;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
}
