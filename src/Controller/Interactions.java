package Controller;

import Model.Door;
import Model.Growers;
import Model.RedHood;
import processing.core.PApplet;
import processing.core.PImage;

public class Interactions {
private boolean allDone;
 RedHood redhood;
 Growers teeth,eyes,ears;
 Door door;
 PImage lobo;
 
	public Interactions(PApplet app) {
		allDone = false;
		redhood = new RedHood(100, 140, 50, 350, app);
		teeth = new Growers(40, 30, 800, 350, "teeth.png", app);
		ears = new Growers(130, 40, 800, 350, "ears.png", app);
		eyes = new Growers(50,10,800,350,"Eyes.png",app);
		lobo = app.loadImage("LI.png");
	}
	public void draw(PApplet app) {
		
	}
}
