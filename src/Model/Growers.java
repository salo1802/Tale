package Model;

import processing.core.PApplet;

public class Growers extends Objeto{
	
	

	public Growers(int sX, int sY, int x, int y, int o, String file, PApplet app) {
		super(sX, sY, x, y, o, file, app);
		// TODO Auto-generated constructor stub
	}
	
	public void grow() {
		sizeX += 5;
		sizeY += 5;
	}
}
