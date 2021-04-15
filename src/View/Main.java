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
	
	Screen prueba;
	Words words;

	
	
	@Override
	public void setup() {
		imageMode(CORNERS);
		prueba = new Screen(this); 
		words = new Words();
		words.wordsConverter(this);
		  
	}
	
@Override
public void draw() {
	background(255);
	prueba.paintScreen(this);;
	if(prueba.getScreenText()==5) {
		words.newtext(this);
	}
	
     
     

     
    
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

