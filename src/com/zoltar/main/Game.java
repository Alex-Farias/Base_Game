package com.zoltar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.zoltar.entities.Entity;
import com.zoltar.entities.Player;
import com.zoltar.engine_settings.MainFrame;
import com.zoltar.engine_settings.MainRender;
import com.zoltar.graphics.Spritesheet;

public class Game extends Canvas implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int WIDTH = 240, HEIGHT = 160, SCALE = 3;
	private MainRender mainRender = new MainRender();
	
	private Thread thread;
	private Graphics g;
	private BufferedImage image;
	
	public static Spritesheet spritesheet;
	public static List<Entity> entities;
	public static Player player;
	
	public Game() {
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		spritesheet = new Spritesheet("/character.png");
		entities = new ArrayList<Entity>();
		
		player = new Player(0, 5, 0, 5, 0, 0, 16, 16, spritesheet, false, false, false, false, 2, 1, 100, 100);
		
		entities.add(player);
		
		MainFrame frame = new MainFrame();
		this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		frame.frameInit("Example", this);
		frame.frameAdd(this);
		frame.frameSetVisible(true);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		
	}
	
	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void tick() {
		// TODO Auto-generated method stub
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
	}
 
	public void render() {
		// TODO Auto-generated method stub
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		g = image.getGraphics();
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
		
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.render(g);
		}
		
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		bs.show();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean temp = true;
		
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		requestFocus();
		
		while (temp == true) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;

			if (delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
			}

			if (System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: " + frames);
				frames = 0;
				timer += 1000;
			}
		}
		stop();
	}
	
	public int getWidth() {
		return this.WIDTH;
	}
	
	public int getHeight() {
		return this.HEIGHT; 
	}
	
	public int getScale() {
		return this.SCALE;
	}
	
	public void setWidth(int width) {
		this.WIDTH = width;
	}
	
	public void setHeight(int height) {
		this.HEIGHT = height; 
	}
	
	public void setScale(int scale) {
		this.SCALE = scale;
	}
}
