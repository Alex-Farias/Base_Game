package com.zoltar.main;

public class Main {
	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Game game = new Game();
		game.start();
	}
}
