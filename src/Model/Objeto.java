package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Objeto {

	public float sizeX;
	public float sizeY;
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
	
	public void animation(PApplet app) {
		
		
		
	
		
		if(growa==false) {
			
		animation++
		;}
		
		if(growa ==true) {
			 
			animation--  ;}
		
		if(animation<=1) {
			growa = false;
		}
		
		if(animation>=9) {
			growa = true;
		}
		
	}
	
	
	
	public int getpX() {
		return pX;
	}
	
	public int getpY() {
		return pY;
	}
	
	public float getSizeX() {
		return sizeX;
	}
	
	public float getSizeY() {
		return sizeY;
	}
	
	public int getAnimation() {
		return animation;
	}
	
	public boolean getGrowa() {
		return growa;
	}
	
	public boolean getInteracted() {
		return interacted;
	}
	
	
	
	public void setpX(int pX) {
		this.pX = pX;
	}
	
	public void setpY(int pY) {
		this.pY = pY;
	}
	
	public void setSizeX(double d) {
		sizeX = (float) d;
	}
	
	public void setSizeY(float y) {
		this.sizeY = y;
	}
	
	public void setInteracted(boolean interacted) {
		this.interacted = interacted;
	}
	
	
}

	