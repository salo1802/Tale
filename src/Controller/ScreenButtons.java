package Controller;

public class ScreenButtons {
	
	public ScreenButtons (){
		ScreenType = 0;
	}
	
	public int ScreenType;
	
	public void buttons(int mouseX, int mouseY) {
		
		if (ScreenType==0) {
			if(mouseX>400 && mouseX < 600 && mouseY > 400 && mouseY < 500) {
				ScreenType=1;
			}
		} 
				
	
	}
	
	public int getScreenType() {
		return ScreenType;
	}
	public void setScreenType(int screenType) {
		ScreenType = screenType;
	}
}
