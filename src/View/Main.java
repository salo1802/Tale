package View;





import processing.core.PApplet;

public class Main extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("View.Main");
	}
	
	@Override
	public void settings() {
		size(1000,700);
		 
		 
	}
	
	Screen prueba;
	

	
	
	@Override
	public void setup() {
		imageMode(CORNERS);
		prueba = new Screen(this); 
		
		  
	}
	
@Override
public void draw() {
	background(255);
	prueba.paintScreen(this);;
	
	
	  
     
     

     
    
	}

@Override
public void mousePressed() {  
	prueba.mouseClick(mouseX, mouseY);
	
		}
@Override
public void mouseDragged() {
	prueba.mouseDrag(mouseX, mouseY);
}
 }

