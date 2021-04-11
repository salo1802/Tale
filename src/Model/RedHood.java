package Model;

import processing.core.PApplet;

public class RedHood extends Objeto{
	
	

	public RedHood(int sX, int sY, int x, int y,  PApplet app) {
		super(sX, sY, x, y, "RH.png", app);
		
		
	}
	
	
	
	
	public void move(int mouseX) {
		if (interacted == false) {
		pX = mouseX;}
	}
	
	
	
	
}
