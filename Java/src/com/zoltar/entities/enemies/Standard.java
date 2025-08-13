package com.zoltar.entities.enemies;

import java.awt.Graphics;

import com.zoltar.engine_settings.RenderStructure;
import com.zoltar.entities.Entity;
import com.zoltar.entities.races.Human;
import com.zoltar.graphics.Spritesheet;

public class Standard extends Human implements RenderStructure{

	public Standard(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			Spritesheet sprite, boolean right, boolean up, boolean left, boolean down, int step,
			int speed, int life, int lifeMax) {
		super(index, indexMax, frames, framesMax, x, y, width, height, sprite, right, up, left, down, step, speed, life,
				lifeMax);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		super.tick();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		super.render(g);
	}

}
