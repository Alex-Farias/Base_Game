package com.zoltar.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.zoltar.graphycs.Spritesheet;
import com.zoltar.engine_settings.MainFrame;
import com.zoltar.engine_settings.MainRender;
import com.zoltar.engine_settings.RenderStructure;

public class Game extends JPanel implements RenderStructure, Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int WIDTH = 240, HEIGHT = 160, SCALE = 3;
	
	private Thread thread;
	private Graphics g;
	private BufferedImage image;
	
	public static Spritesheet spritesheet;
	
	public Game() {
		spritesheet = new Spritesheet("/spritesheet.png");
		
		MainFrame frame = new MainFrame();
		
		this.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		frame.frameInit("Example", this);
		frame.frameAdd(this);
		frame.frameSetVisible(true);
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
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

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void render() {
		// TODO Auto-generated method stub
		MainRender mainRender = new MainRender();
		BufferStrategy bs = mainRender.render(this);
		
		g = image.getGraphics();
		g.setColor(new Color(0, 0, 0));
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
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
