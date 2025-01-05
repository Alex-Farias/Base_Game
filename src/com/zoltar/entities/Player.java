package com.zoltar.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.zoltar.engine_settings.RenderStructure;
import com.zoltar.graphics.Spritesheet;

public class Player extends Entity implements RenderStructure{
	public Player(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			Spritesheet sprite, boolean right, boolean up, boolean left, boolean down, int step,
			int speed, int life, int lifeMax) {
		super(index, indexMax, frames, framesMax, x, y, width, height, sprite, right, up, left, down, step, speed, life,
				lifeMax);
		// TODO Auto-generated constructor stub
		this.setSkinLenght(indexMax);
		
		for (int i = 0; i < 4; i++) {
			this.setSkinByIndex(i, sprite.getSprite(32 + (i * 16), 0, 16, 16));
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(this.getSkinByIndex(this.getIndex()), this.getX(), this.getY(), null);
	}
}
