package gui.sampleGames;

import java.util.ArrayList;

import gui.Screen;
import gui.Components.TextLabel;
import gui.Components.Visible;
import sampleImages.Graphic;

public class MyScreen extends Screen {

	private Graphic bat;
	private TextLabel text;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		bat = new Graphic(150,30,2.0,"resources/sampleImages/bat.jpg");
		text = new TextLabel(200, 400, 500, 40, "NANANANA BATMAN");
		viewObjects.add(bat);

		viewObjects.add(text);
	}

}
