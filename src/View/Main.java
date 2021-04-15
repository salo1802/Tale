package View;




import Controller.Interactions;
import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Interactions prueba;
	

	
	
	@Override
	public void setup() {
		imageMode(CORNERS);
		prueba = new Interactions(this); 
		
		  
	}
	
@Override
public void draw() {
	background(255);
	prueba.draw(this);
	
	
	  
     
     

     
    
	}

@Override
public void mousePressed() {  
	prueba.clickNGrow(mouseX, mouseY);
	prueba.click(mouseX, mouseY);
		}
@Override
public void mouseDragged() {
	prueba.mouseDrag(mouseX, mouseY);
}
 }

