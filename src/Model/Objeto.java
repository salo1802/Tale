package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Objeto {

	public int sizeX;
	public int sizeY;
	public int pX;
	public int pY;
	public int opacity;
	public int animation;
	PImage image;
	
	public Objeto(int sX,int sY,int x,int y,int o, String file,PApplet app) {
		
		sizeX = sX;
		sizeY = sY;
		pX = x;
		pY = y;
		opacity = o;
		animation = 0;
		image = app.loadImage(file);
		
	}
	
	public void paintObject(PApplet app) {

		app.image(image, pX - sizeX, pY - sizeY,pX + sizeX,pY + sizeY);
	}
	
	public void animation() {}
	
	public int getOpacity() {
		return opacity;
	}
	
	public int getpX() {
		return pX;
	}
	
	public int getpY() {
		return pY;
	}
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}
	
	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}
	
	public void setpX(int pX) {
		this.pX = pX;
	}
	
	public void setpY(int pY) {
		this.pY = pY;
	}
	
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
}

	