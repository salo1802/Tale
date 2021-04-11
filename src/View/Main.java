package View;

import Model.Objeto;
import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Objeto prueba;
	

	
	
	@Override
	public void setup() {
		imageMode(CORNERS);
		prueba = new Objeto(100,60,500,450,100, "Eyes.png", this);
		
		  
	}
	
@Override
public void draw() {
	background(255);
	prueba.paintObject(this);
	prueba.animation();
	
	  
     
     

     
    
	}

 }

