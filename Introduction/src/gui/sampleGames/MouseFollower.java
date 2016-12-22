package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;
import gui.screens.MovementScreen;

public class MouseFollower extends GUIApplication{

	public static CoordinateScreen cs;
	public static MouseFollower game;//only one exists (no one plays three of the same game at the same time)
	public static MovementScreen myScreen;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		myScreen = new MovementScreen(getWidth(), getHeight());
	}

	public static void main(String[] args){
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}
	
}
