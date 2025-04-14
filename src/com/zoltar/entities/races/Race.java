package com.zoltar.entities.races;

import java.awt.image.BufferedImage;

import com.zoltar.entities.Entity;
import com.zoltar.graphics.Spritesheet;

public class Race extends Entity {

	public Race(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			Spritesheet sprite, boolean right, boolean up, boolean left, boolean down, int step, int speed, int life,
			int lifeMax) {
		super(index, indexMax, frames, framesMax, x, y, width, height, sprite, right, up, left, down, step, speed, life,
				lifeMax);
		// TODO Auto-generated constructor stub
	}
	
}
