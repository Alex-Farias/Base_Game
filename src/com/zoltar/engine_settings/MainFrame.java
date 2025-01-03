package com.zoltar.engine_settings;

import java.awt.Component;

import javax.swing.JFrame;

import com.zoltar.main.Game;

public class MainFrame {
	private JFrame frame;
	
	public void frameInit(String title, Game game) {
		frame = new JFrame(title);
		frame.add(game);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(false);
	}
	
	public void frameAdd(Component component) {
		frame.add(component);
	}
	
	public void frameSetVisible(boolean visible) {
		frame.setVisible(visible);
	}
}
