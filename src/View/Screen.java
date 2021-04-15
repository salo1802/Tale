package View;

import Controller.Interactions;
import Controller.ScreenButtons;
import processing.core.PApplet;
import processing.core.PImage;

public class Screen {
	ScreenButtons button;
	Interactions screen1;
	private int screenType;
	private int screenText;
	int time = 0;
	PImage beginning;
	PImage end;
	
	
	Screen (PApplet app){
		app.frameRate = 30;
		button = new ScreenButtons(); 
		screen1 = new Interactions(app);
		beginning = app.loadImage("first.png");
		end = app.loadImage("final.png");
		app.textSize(50);
	}
	
	
	public void paintScreen(PApplet app) {
		screenType = button.getScreenType();
		switch (screenType) {
		case 0: 
			app.image(beginning, 0, 0,1000,700);
			break;
		case 1:
			screen1.draw(app);
			app.fill(255);
			switch (screenText) {
			case 0:
			app.text("caperucita llamó a la puerta", 500, 200);
			case 1:
				app.text("y se acerco a su abuela", 500, 200);
			break;
			case 2:
				app.text("dijo: Que ojos tan grandes", 500, 200);
			break;
			case 3:
				app.text(" luego dijo: Que orejas tan grandes", 500, 200);
			break;
			case 4:
			app.text(" luego dijo: Que dientes tan grandes", 500, 200);
			break;}
		break;
		case 2:
			app.image(end, 0,0,1000,700);
			break;}
		//logic
		
		if(screen1.getStep()==5) {
			
			if(app.frameCount%30==0) {time++;}
			if (time==6) {
				button.setScreenType(2);
			}
			
		}
		
		screenText = screen1.getStep();
		
	}
	
	public void mouseDrag(int mouseX,int mouseY) {
		if(screenType==1) {
			screen1.mouseDrag(mouseX, mouseY);
		}
	}
	
	public void mouseClick(int mouseX,int mouseY) {
		if (screenType == 0) {button.buttons(mouseX, mouseY);}
		if(screenType==1) {
		screen1.click(mouseX, mouseY);
		screen1.clickNGrow(mouseX, mouseY);}
	}

	public int getScreenType() {
		return screenType;
	}
	
	public int getScreenText() {
		return screenText;
	}
}
