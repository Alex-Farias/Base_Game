package com.zoltar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import com.zoltar.engine_settings.Camera;
import com.zoltar.engine_settings.ControlBoard;
import com.zoltar.engine_settings.MainFrame;
import com.zoltar.engine_settings.physics.Physics;
import com.zoltar.entities.Entity;
import com.zoltar.entities.Player;
import com.zoltar.graphics.Spritesheet;
import com.zoltar.world.Floor;

public class Game extends Canvas implements Runnable, KeyListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static int width = 240, height = 135, scale = 3;
	
	private Thread thread;
	private Graphics g;
	private BufferedImage image;
	private ControlBoard controlBoard;
	
	public static MainFrame frame;
	public static Physics physics;
	public static Spritesheet spritesheet;
	public static List<Floor> floors;
	public static List<Entity> entities;
	public static Player player;
	
	public Game() {
		spritesheet = new Spritesheet("/art_model/player/character.png");
		
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		floors = new ArrayList<Floor>();
		entities = new ArrayList<Entity>();
		
		player = new Player(0, 5, 0, 5, 0, 0, 27, 10, spritesheet, false, false, false, false, 2, 5, 100, 100);
		
		entities.add(player);
		frame = new MainFrame(this);
		frame.frameInit("Example");
		frame.frameAdd(this);
		frame.setFrameSize(frame.getEnums().WINDOW);
		frame.setFrameVisible(true);
		
		controlBoard = new ControlBoard();
		addKeyListener(this);
		addMouseListener(this);
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
		//physics.gravity(floors, entities);
		
		// TODO Auto-generated method stub
		for (int i = 0; i < floors.size(); i++) {
			Floor f = floors.get(i);
			f.tick();
			//System.out.println(e.getY());
		}
		
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
			//System.out.println(e.getY());
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
		//g.fillRect(0, 0, 240 * 1, 135 * 1);
		g.fillRect(0, 0, this.getWidth() * this.getScale(), this.getHeight() * this.getScale());
		
		Camera.move(player.getX() - (this.getWidth()/2), player.getY() - (this.getHeight()/2));
		
		for (int i = 0; i < floors.size(); i++) {
			Floor f = floors.get(i);
			f.render(g);
		}
		
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.render(g);
		}
		
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, frame.getWidth(), frame.getHeight(), null);
		//g.drawImage(image, 0, 0, 2560, 1080, null);
		bs.show();
	}
	
	public void setImage() {
		image = new BufferedImage(this.getWidth() * this.getScale(), this.getHeight() * this.getScale(), BufferedImage.TYPE_INT_RGB);
		//image = new BufferedImage(getWidth() * getScale(), getHeight() * getScale(), BufferedImage.TYPE_INT_RGB);
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
				//System.out.println("FPS: " + frames);
				frames = 0;
				timer += 1000;
			}
		}
		stop();
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height; 
	}
	
	public int getScale() {
		return this.scale;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height; 
	}
	
	public void setScale(int scale) {
		this.scale = scale;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getMOUSE_RELEASED(), e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getMOUSE_ENTERED(), e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getMOUSE_EXITED(), e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getKEY_TYPED(), e.getKeyCode(), player);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getKEY_PRESSED(), e.getKeyCode(), player);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		controlBoard.doControl(controlBoard.getKEY_RELEASED(), e.getKeyCode(), player);
	}
}
