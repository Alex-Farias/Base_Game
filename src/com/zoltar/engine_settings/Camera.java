package com.zoltar.engine_settings;

public class Camera {
	private static int cameraXOffSet = 0, cameraYOffSet = 0;
	
	public static void move(int x, int y){
		setCameraXOffSet(x);
		setCameraYOffSet(y);
	}
	
	public static int getCameraXOffSet() {
		return cameraXOffSet;
	}
	
	public static int getCameraYOffSet() {
		return cameraYOffSet;
	}
	
	public static void setCameraXOffSet(int x) {
		cameraXOffSet = x;
	}
	
	public static void setCameraYOffSet(int y) {
		cameraYOffSet = y;
	}
}
