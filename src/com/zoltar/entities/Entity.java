package com.zoltar.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.zoltar.engine_settings.RenderStructure;
import com.zoltar.graphics.Spritesheet;

public class Entity implements RenderStructure{
	private int index, indexMax;
	private int frames, framesMax;
	private int x, y, width, height;
	private Spritesheet sprite;
	private BufferedImage[] skin;
	
	private boolean right, up, left, down;
	private int step, speed;
	
	private int life, lifeMax;
	
	public Entity(int index, int indexMax, int frames, int framesMax, int x, int y, int width, int height,
			Spritesheet sprite, boolean right, boolean up, boolean left, boolean down, int step,
			int speed, int life, int lifeMax) {
		super();
		this.index = index;
		this.indexMax = indexMax;
		this.frames = frames;
		this.framesMax = framesMax;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
		this.right = right;
		this.up = up;
		this.left = left;
		this.down = down;
		this.step = step;
		this.speed = speed;
		this.life = life;
		this.lifeMax = lifeMax;
	}



	public int getIndex() {
		return index;
	}



	public int getIndexMax() {
		return indexMax;
	}



	public int getFrames() {
		return frames;
	}



	public int getFramesMax() {
		return framesMax;
	}



	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public int getWidth() {
		return width;
	}



	public int getHeight() {
		return height;
	}



	public Spritesheet getSprite() {
		return sprite;
	}



	public BufferedImage[] getSkin() {
		return skin;
	}
	
	public BufferedImage getSkinByIndex(int i) {
		return skin[i];
	}

	public boolean isRight() {
		return right;
	}



	public boolean isUp() {
		return up;
	}



	public boolean isLeft() {
		return left;
	}



	public boolean isDown() {
		return down;
	}



	public int getStep() {
		return step;
	}



	public int getSpeed() {
		return speed;
	}



	public int getLife() {
		return life;
	}



	public int getLifeMax() {
		return lifeMax;
	}



	public void setIndex(int index) {
		this.index = index;
	}



	public void setIndexMax(int indexMax) {
		this.indexMax = indexMax;
	}



	public void setFrames(int frames) {
		this.frames = frames;
	}



	public void setFramesMax(int framesMax) {
		this.framesMax = framesMax;
	}



	public void setX(int x) {
		this.x = x;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public void setSprite(Spritesheet sprite) {
		this.sprite = sprite;
	}

	public void setSkin(int i, BufferedImage[] skin) {
		this.skin = skin;
	}
	
	public void setSkinByIndex(int i, BufferedImage skin) {
		this.skin[i] = skin;
	}
	
	public void setSkinLenght(int i) {
		this.skin = new BufferedImage[i];
	}

	public void setRight(boolean right) {
		this.right = right;
	}



	public void setUp(boolean up) {
		this.up = up;
	}



	public void setLeft(boolean left) {
		this.left = left;
	}



	public void setDown(boolean down) {
		this.down = down;
	}



	public void setStep(int step) {
		this.step = step;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public void setLife(int life) {
		this.life = life;
	}



	public void setLifeMax(int lifeMax) {
		this.lifeMax = lifeMax;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(skin[this.getIndex()], this.getX(), this.getY(), null);
	}
}
