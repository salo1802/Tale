package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Objeto {

	public int sizeX;
	public int sizeY;
	public int pX;
	public int pY;
	public boolean interacted;
	public int animation;
	public boolean growa;
	PImage image;
	
	public Objeto(int sX,int sY,int x,int y, String file,PApplet app) {
		
		sizeX = sX;
		sizeY = sY;
		pX = x;
		pY = y;
		animation = 0;
		interacted = false;
		growa = false;
		image = app.loadImage(file);
		
	}
	
	public void paintObject(PApplet app) {

		app.image(image, pX - sizeX/2, pY - sizeY/2,pX + sizeX/2,pY + sizeY/2);
	}
	
	public void animation() {
		
		
		
		sizeX = sizeX+animation;
		sizeY = sizeY+animation;
				
		
		if(growa==false) {
		animation++
		;}
		
		if(growa ==true) {
			animation--  ;}
		
		if(animation<=1) {
			growa = false;
		}
		
		if(animation>=99) {
			growa = true;
		}
		
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
	
	public void setInteracted(boolean interacted) {
		this.interacted = interacted;
	}
}

	