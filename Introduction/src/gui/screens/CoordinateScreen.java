package gui.screens;

import java.awt.Color;
import gui.Components.Button;
import gui.Components.Action;
import java.util.ArrayList;

import gui.Screen;
import gui.Components.TextLabel;
import gui.Components.Visible;

public class CoordinateScreen extends Screen{

	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some Text");
		button = new Button(20,100,80,40,"Button", new Color(100,100,250), new Action() {
			public void act(){
				
			}
		});
	}

}
