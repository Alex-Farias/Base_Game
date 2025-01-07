package com.zoltar.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.zoltar.engine_settings.RenderStructure;
import com.zoltar.entities.races.Human;
import com.zoltar.graphics.Spritesheet;

public class Player extends Human implements RenderStructure{
	public Player(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			Spritesheet sprite, boolean right, boolean up, boolean left, boolean down, int step,
			int speed, int life, int lifeMax) {
		super(index, indexMax, frames, framesMax, x, y, width, height, sprite, right, up, left, down, step, speed, life,
				lifeMax);
		// TODO Auto-generated constructor stub
		this.setSkinLenght(indexMax);
		
		for (int i = 0; i < 3; i++) {
			this.setSkinByIndex(i, sprite.getSprite(0 + (i * 10), 0, 10, 27));
		}
	}
	
	public void walk() {
		//example
		if(this.isRight() && !this.isLeft()) {
			this.setX(this.getX() + (this.getStep() * this.getSpeed()));
		}else if(!this.isRight() && this.isLeft()) {
			this.setX(this.getX() - (this.getStep() * this.getSpeed()));
		}
		
		if(this.isUp() && !this.isDown()) {
			this.setY(this.getY() - (this.getStep() * this.getSpeed()));
		}else if(!this.isUp() && this.isDown()) {
			this.setY(this.getY() + (this.getStep() * this.getSpeed()));
		}
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		this.walk();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(this.getSkinByIndex(this.getIndex()), this.getX(), this.getY(), null);
	}
}
