package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import gui.Components.Button;
import gui.Components.Action;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.TextLabel;
import gui.Components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button;
	private TextLabel text;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Some Text");
		button = new Button(20,100,80,40,"Button", new Color(100,100,250), new Action() {
			public void act(){
				
			}
		});
		viewObjects.add(text);
		viewObjects.add(button);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinates
		int my = e.getY();//get Y coord
		text.setText("Mouse at: "+mx+", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
}
