package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import gui.Components.Button;
import gui.Components.TextArea;
import gui.Components.Action;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.TextLabel;
import gui.Components.Visible;
import sampleImages.Graphic;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic bat;
	
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
		area = new TextArea(20, 300, 700, 100, "ajksf asdf sdf sdf sdf scv sdg gv sd wef wsf sc sf sf sdg s sg sdf df sd fs df sdg d");
		bat = new Graphic(150,30,100,100,"resources/sampleImages/bat.jpg");
		viewObjects.add(text);
		viewObjects.add(button);
		viewObjects.add(area);
		viewObjects.add(bat);
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
