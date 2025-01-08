package com.zoltar.engine_settings;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import com.zoltar.main.Game;

public class MainFrame {
	private JFrame frame;
	private Game game;
	private MainFrameEnum frameEnum;
	
	private int width, height;
	
	public MainFrame(Game game) {
		this.game = game;
	}
	
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
	
	public void setFrameSize(MainFrameEnum enums) {
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		switch(enums) {
			case FULLSCREEN:
				frame.setUndecorated(true);
				try {
		            if (gd.isFullScreenSupported()) {
		                gd.setFullScreenWindow(frame);
		                this.setWidth(frame.getWidth());
		                this.setHeight(frame.getHeight());
		            } else {
		                frame.setSize(game.getWidth(), game.getHeight());
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		            gd.setFullScreenWindow(null);
		        }
				break;
			case WINDOW:
				game.setPreferredSize(new Dimension(game.getWidth() * game.getScale(), game.getHeight() * game.getScale()));
				frame.pack();
				break;
			default:
				break;
		}
		game.setImage();
		frame.setVisible(true);
	}
	
	public MainFrameEnum getEnums() {
		return frameEnum;
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
