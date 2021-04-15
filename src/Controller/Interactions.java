package Controller;

import Model.Door;
import Model.Growers;
import Model.Objeto;
import Model.RedHood;
import processing.core.PApplet;
import processing.core.PImage;

public class Interactions {
 RedHood redhood;
 Growers teeth,eyes,ears;
 Door door;
 Objeto wolf;
 private int step;
 private int LsX=1000;
 private int LsY=700;
 
	public Interactions(PApplet app) {
		redhood = new RedHood(150, 210, 200, 270, app);
		teeth = new Growers(40, 35, 730, 370, "teeth.png", app);
		ears = new Growers(115, 70, 740, 190, "ears.png", app);
		eyes = new Growers(50,30,740,260,"Eyes.png",app);
		wolf = new Objeto(LsX, LsY, 800, 450, "LI.png", app);
		door = new Door(app);
		step = 0;
	}
	
	
	public void draw(PApplet app) {
		
		//paint
		door.paintDoor(app);
		wolf.paintObject(app);
		if(door.getInteracted()==true)redhood.paintObject(app);
		teeth.paintObject(app);
		ears.paintObject(app);
		eyes.paintObject(app);
		//animation
		wolf.animation(app);
		redhood.animation(app);
		teeth.animation(app);
		ears.animation(app);
		eyes.animation(app);
		
		if(redhood.getInteracted()==true) {
			if(wolf.growa==true) {
			redhood.setSizeY(redhood.getSizeY()+7);
			redhood.setSizeX(redhood.getSizeX()+5);}
			if(wolf.growa==false) {
				redhood.setSizeY(redhood.getSizeY()-7); 
				redhood.setSizeX(redhood.getSizeX()-5);}}
		
		if(wolf.getInteracted()==true) {
		if(ears.getInteracted()==true) {
			if(wolf.growa==true) {
			ears.setSizeY(ears.getSizeY()+1.4);
			ears.setSizeX(ears.getSizeX()+2.3);
			ears.setpY(ears.getpY()-2);}
			if(wolf.growa==false) {
				ears.setSizeY(ears.getSizeY()-1.4); 
				ears.setSizeX(ears.getSizeX()-2.3);
				ears.setpY(ears.getpY()+2);}}
		
	
		if(eyes.getInteracted()==true) {
			if(wolf.growa==true) {
				eyes.setSizeY(eyes.getSizeY()+1);
				eyes.setSizeX(eyes.getSizeX()+0.6);
				eyes.setpY(eyes.getpY()-2);}
			if(wolf.growa==false) {
				eyes.setSizeY(eyes.getSizeY()-1);
				eyes.setSizeX(eyes.getSizeX()-0.6);
				eyes.setpY(eyes.getpY()+2);}}
	

		if(teeth.getInteracted()==true) {
			if(wolf.growa==true) {
				teeth.setSizeY(teeth.getSizeY()+1);
				teeth.setSizeX(teeth.getSizeX()+0.6);
				teeth.setpY(teeth.getpY()-1);
				teeth.setpX(teeth.getpX()-1);}
			
			if(wolf.growa==false) {
				teeth.setSizeY(teeth.getSizeY()-1);
				teeth.setSizeX(teeth.getSizeX()-0.6);
				teeth.setpY(teeth.getpY()+1);
				teeth.setpX(teeth.getpX()+1);}}
		
		if(wolf.getGrowa()==true) {
			wolf.setSizeY(wolf.getSizeY()+7);
			wolf.setSizeX(wolf.getSizeX()+10);
			}
			
			if(wolf.getGrowa()==false) {
				wolf.setSizeY(wolf.getSizeY()-7);
				wolf.setSizeX(wolf.getSizeX()-10);
				
			}
		}	
			//logic of interaction
			if(redhood.getpX()>450 && redhood.getpY()>500) {
				redhood.setInteracted(true);
			}
			
			if(teeth.getSizeX()== 80 && teeth.getSizeY()==70) {
				teeth.setInteracted(true);
			}
			
			
			if(eyes.getSizeX()== 120 && eyes.getSizeY()==72) {
				eyes.setInteracted(true);
			}
			
			if(ears.getSizeX()== 230 && ears.getSizeY()==140) {
				ears.setInteracted(true);
				
				if(teeth.getInteracted()==true) {
					wolf.setInteracted(true);
				}
			}
			
			
			//logic of step
			if(door.getInteracted()==true && redhood.getInteracted()==false) step = 1;
			if(redhood.getInteracted()==true && eyes.getInteracted()==false) step = 2;
			if(eyes.getInteracted()==true && ears.getInteracted()==false) step = 3;
			if(ears.getInteracted()==true && teeth.getInteracted()==false) step = 4;
			if(teeth.getInteracted() == true) {step = 5;}
			
	}
	
	public void click(int mouseX,int mouseY) {
		if (door.getInteracted()==false) {
			if(mouseX>150 && mouseX < 230 && mouseY > 130 && mouseY < 360) {
				door.setInteracted(true);
			}
	}}
	
	/*
	 teeth = new Growers(80, 70, 730, 370, "teeth.png", app);
		ears = new Growers(230, 140, 740, 190, "ears.png", app);
		eyes = new Growers(120,72,740,260,"Eyes.png",app);
	
	 */

	public void clickNGrow(int mouseX,int mouseY) {
		if(redhood.getInteracted()==true) {
				
			
			if(eyes.getInteracted()==false) {
				if(mouseX > eyes.getpX()-eyes.getSizeX()/2 && mouseX < eyes.getpX()+eyes.getSizeX()/2
					&& mouseX > eyes.getpY()-eyes.getSizeY()/2 && mouseY < eyes.getpY()+eyes.getSizeY()/2	) {
					eyes.grow(10 , 6 );
				}}	
			if(eyes.getInteracted()==true) {
			if(ears.getInteracted()==false) {
				if(mouseX > ears.getpX()-ears.getSizeX()/2 && mouseX < ears.getpX()+ears.getSizeX()/2
					&& mouseX > ears.getpY()-ears.getSizeY()/2 && mouseY < ears.getpY()+ears.getSizeY()/2	) {
					ears.grow(23 , 14 );
				}}}
			
			if(ears.getInteracted()==true) {
			if(teeth.getInteracted()==false) {
				if(mouseX > teeth.getpX()-teeth.getSizeX()/2 && mouseX < teeth.getpX()+teeth.getSizeX()/2
					&& mouseX > teeth.getpY()-teeth.getSizeY()/2 && mouseY < teeth.getpY()+teeth.getSizeY()/2	) {
					teeth.grow(8 , 7 );
				}}	}
		}}
	
	
	public void mouseDrag(int mouseX, int mouseY) {
		if(door.getInteracted( )== true && redhood.interacted==false) {
		if(mouseX< 500) {
		redhood.move(mouseX,mouseY);
		redhood.setpX(mouseX);
		redhood.setpY(mouseY);
		redhood.setSizeX(mouseX);
		redhood.setSizeY(mouseX*1.4);
		}}
	}
	
	public int getStep() {
		return step;
	}
	
}
