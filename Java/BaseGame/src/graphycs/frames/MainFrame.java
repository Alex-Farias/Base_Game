package graphycs.frames;

import graphycs.frames.enums.MainFrameEnum;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private int width, height;
    private JFrame frame;
    private MainFrameEnum enums;

    public void start(String title) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(false);
    }

    public void add(Component component) {
        frame.add(component);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public Dimension setSize(MainFrameEnum en) {
        Dimension dim = new Dimension(0, 0);
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        switch(en) {
            case FULLSCREEN:
                frame.setUndecorated(true);
                try {
                    if (gd.isFullScreenSupported()) {
                        gd.setFullScreenWindow(frame);
                        this.setWidth(frame.getWidth());
                        this.setHeight(frame.getHeight());
                        dim = new Dimension(frame.getWidth(), frame.getHeight());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    gd.setFullScreenWindow(null);
                }
                break;
            case WINDOW:
                dim = new Dimension(0, 0);
                frame.pack();
                break;
            default:
                dim = null;
                break;
        }
        //game.setImage();
        frame.setVisible(true);
        return dim;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public MainFrameEnum getEnums() {
        return enums;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
