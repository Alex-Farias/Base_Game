package interfaces;

import interfaces.enums.MainFrameEnum;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private int width, height;
    private JFrame frame;

    public void frameInit(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);
    }

    public void frameAdd(Component component) {
        frame.add(component);
    }

    public void setFrameVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public Dimension setFrameSize(MainFrameEnum enums) {
        Dimension dimension = new Dimension(0, 0);
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        switch(enums) {
            case FULLSCREEN:
                frame.setUndecorated(true);
                try {
                    if (gd.isFullScreenSupported()) {
                        gd.setFullScreenWindow(frame);
                        this.setWidth(frame.getWidth());
                        this.setHeight(frame.getHeight());
                        dimension = new Dimension(this.getWidth(), this.getHeight());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    gd.setFullScreenWindow(null);
                }
                break;
            case WINDOW:
                frame.pack();
                dimension = new Dimension(0, 0);
                break;
            default:
                dimension = null;
                break;
        }
        //game.setImage();
        frame.setVisible(true);
        return dimension;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
