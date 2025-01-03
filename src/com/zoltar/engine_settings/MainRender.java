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
		BufferStrategy bs; 
		if(this.getBufferStrategy() == null) {
			this.createBufferStrategy(3);
		}
		return bs = this.getBufferStrategy();
	}
}
