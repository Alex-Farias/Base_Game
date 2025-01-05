package com.zoltar.engine_settings;

import java.awt.Canvas;
import java.awt.image.BufferStrategy;

import com.zoltar.main.Game;

public class MainRender extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BufferStrategy render(Game game) {
		BufferStrategy buffer = this.getBufferStrategy();

		System.out.println(buffer);
		if (buffer == null) {
			this.generateRender(3);
			buffer = this.getBufferStrategy();
		}
		return buffer;
	}
	
	public void generateRender(int i) {
		this.createBufferStrategy(i);
	}
}
