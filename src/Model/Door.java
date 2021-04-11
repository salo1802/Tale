package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Door extends Objeto{

	PImage image2;
	public Door(int sX, int sY, int x, int y,  PApplet app) {
		super(sX, sY, x, y, "FPC.jpg", app);
		image2 = app.loadImage("FPA.jpg");
		
		// TODO Auto-generated constructor stub
	}
	
	public void paintDoor(PApplet app) {
		if(interacted==false) {
			paintObject(app);
		}
		if(interacted==true) {
			app.image(image2, pX - sizeX/2, pY - sizeY/2,pX + sizeX/2,pY + sizeY/2);
		}
	}

}
