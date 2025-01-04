package com.zoltar.entities;

import java.awt.image.BufferedImage;

public class Player extends Entity{

	public Player(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			BufferedImage sprite, boolean right, boolean up, boolean left, boolean down, int step, int speed, int life,
			int lifeMax) {
		super(index, indexMax, frames, framesMax, x, y, width, height, sprite, right, up, left, down, step, speed, life,
				lifeMax);
		// TODO Auto-generated constructor stub
	}

}
