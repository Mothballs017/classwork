package gui.whackAMole;

import sampleImages.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/legobat.jpg");
		
	}

	public int getAppearanceTime() {
		return appearanceTime;
	}

	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}

}
