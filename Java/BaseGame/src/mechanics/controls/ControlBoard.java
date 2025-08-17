package mechanics.controls;

import entities.Entity;
import entities.creatures.Creature;
import entities.player.Player;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class ControlBoard {
    private final String KEY_TYPED = "KEY_TYPED";
    private final String KEY_PRESSED = "KEY_PRESSED";
    private final String KEY_RELEASED = "KEY_RELEASED";
    private final String MOUSE_RELEASED = "MOUSE_RELEASED";
    private final String MOUSE_ENTERED = "MOUSE_ENTERED";
    private final String MOUSE_EXITED = "MOUSE_EXITED";

    public void doControl(String control, KeyEvent event) {

    }

    public void doControl(String control, MouseEvent event) {

    }

    public void doControl(String control, int event, Creature creature) {
        switch(control) {
            case KEY_TYPED:
                break;
            case KEY_PRESSED:
                switch(event) {
                    case KeyEvent.VK_W:
                        creature.setUp(true);
                        break;
                    case KeyEvent.VK_A:
                        creature.setLeft(true);
                        break;
                    case KeyEvent.VK_S:
                        creature.setDown(true);
                        break;
                    case KeyEvent.VK_D:
                        creature.setRight(true);
                        break;
                    default:
                        break;
                }
                break;
            case KEY_RELEASED:
                switch(event) {
                    case KeyEvent.VK_W:
                        creature.setUp(false);
                        break;
                    case KeyEvent.VK_A:
                        creature.setLeft(false);
                        break;
                    case KeyEvent.VK_S:
                        creature.setDown(false);
                        break;
                    case KeyEvent.VK_D:
                        creature.setRight(false);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }

    public void doControl(String control, MouseEvent event, Player player) {
        switch(control) {
            case MOUSE_RELEASED:
                break;
            case MOUSE_ENTERED:
                break;
            case MOUSE_EXITED:
                break;
            default:
                break;
        }
    }

    public String getKEY_TYPED() {
        return KEY_TYPED;
    }

    public String getKEY_PRESSED() {
        return KEY_PRESSED;
    }

    public String getKEY_RELEASED() {
        return KEY_RELEASED;
    }

    public String getMOUSE_RELEASED() {
        return MOUSE_RELEASED;
    }

    public String getMOUSE_ENTERED() {
        return MOUSE_ENTERED;
    }

    public String getMOUSE_EXITED() {
        return MOUSE_EXITED;
    }
}
