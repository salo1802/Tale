package Controller;

import Model.Door;
import Model.Growers;
import Model.Objeto;
import Model.RedHood;
import processing.core.PApplet;
import processing.core.PImage;

public class Interactions {
private boolean allDone;
 RedHood redhood;
 Growers teeth,eyes,ears;
 Door door;
 Objeto lobo;
 private int LsX=1000;
 private int LsY=700;
 
	public Interactions(PApplet app) {
		allDone = false;
		redhood = new RedHood(150, 210, 200, 270, app);
		teeth = new Growers(80, 70, 730, 370, "teeth.png", app);
		ears = new Growers(230, 140, 740, 190, "ears.png", app);
		eyes = new Growers(120,72,740,260,"Eyes.png",app);
		lobo = new Objeto(LsX, LsY, 800, 450, "LI.png", app);
		door = new Door(app);
	}
	
	
	public void draw(PApplet app) {
		
		door.paintDoor(app);
		lobo.paintObject(app);
		redhood.paintObject(app);
		teeth.paintObject(app);
		ears.paintObject(app);
		eyes.paintObject(app);
		//animation
		lobo.animation(app);
		redhood.animation(app);
		teeth.animation(app);
		ears.animation(app);
		eyes.animation(app);
		
		if(redhood.getInteracted()==true) {
			if(redhood.growa==true) {
			redhood.setSizeY(redhood.getSizeY()+7);
			redhood.setSizeX(redhood.getSizeX()+5);}
			if(redhood.growa==false) {
				redhood.setSizeY(redhood.getSizeY()-7); 
				redhood.setSizeX(redhood.getSizeX()-5);}
			
			
		}
		
		
		if(lobo.getGrowa()==true) {
			lobo.setSizeY(lobo.getSizeY()+7);
			lobo.setSizeX(lobo.getSizeX()+10);
			eyes.setSizeY(eyes.getSizeY()+1);
			eyes.setSizeX(eyes.getSizeX()+0.6);
			eyes.setpY(eyes.getpY()-2);}
			
			if(lobo.getGrowa()==false) {
				lobo.setSizeY(lobo.getSizeY()-7);
				lobo.setSizeX(lobo.getSizeX()-10);
				eyes.setSizeY(eyes.getSizeY()-1);
				eyes.setSizeX(eyes.getSizeX()-0.6);
				eyes.setpY(eyes.getpY()+2);
			}
		
	}
	
	public  boolean tPrueba(){
		return lobo.getGrowa();}
}
