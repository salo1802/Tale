package View;


import Model.Words;
import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Words prueba;
	

	
	
	@Override
	public void setup() {
	prueba = new Words();
	prueba.wordsConverter(this);
	System.out.println(prueba.getWords());
	prueba.newtext(this);
		  
	}
	
@Override
public void draw() {
	background(255);
	
	  
     
     

     
    
	}

 }

