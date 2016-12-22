package sampleImages;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import gui.Components.Action;
import gui.Components.Clickable;

public class ClickableGraphic extends Graphic implements Clickable,MouseMotionListener,MouseListener{
	
	private Action action;
	
	public void setAction(Action a){
		this.action = a;
	}
	
	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation,0,0);
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation,w,h);
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		this.setX(x);
		this.setY(y);
		setLoadedImages(false);
		loadImages(imageLocation, scale);
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public boolean isHovered(int x, int y) {
		return x>getX() && x<getX()+getWidth() && y > getY() && y<getY()+getHeight();
	}

	@Override
	public void act(){
		if(action != null)action.act();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
