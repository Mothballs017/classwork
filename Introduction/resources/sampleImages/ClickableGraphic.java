package sampleImages;

import gui.Components.Action;
import gui.Components.Clickable;

public class ClickableGraphic extends Graphic implements Clickable {

	private Action action;
	
	public void setAction(Action a){
		this.action = a;
		update();
	}
	
	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
	}

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
	}

	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	public void act() {
		if(action != null)action.act();
	}

}
