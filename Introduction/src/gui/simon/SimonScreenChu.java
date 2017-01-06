package gui.simon;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import gui.Components.Action;
import gui.Components.TextLabel;
import gui.Components.Visible;
import gui.screens.ClickableScreen;
import gui.whackAMole.MoleInterface;
import gui.whackAMole.PlayerInterface;

public class SimonScreenChu extends ClickableScreen implements Runnable {

	private ArrayList<MoveInterfaceChu> pattern;
	private ButtonInterfaceChu[] buttons;
	private ProgressInterfaceChu progress;
	private TextLabel label;
	int roundNumber;
	boolean acceptingInput;
	int patternIndex;
	int lastSelectedButton;
	
	public SimonScreenChu(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		pattern = new ArrayList<MoveInterfaceChu>();
		//add 2 moves to start
		lastSelectedButton = -1;
		pattern.add(randomMove());
		pattern.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceChu randomMove() {
		ButtonInterfaceChu b;
		b.setAction(new Action(){

			public void act(){
				if(acceptingInput){
					
				}
			}

			});
		//code that randomly selects a ButtonInterfaceX
		return getMove(b);
	}

	private MoveInterfaceChu getMove(ButtonInterfaceChu b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
		Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceChu getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 5;
		Color[] colors = {Color.red, Color.blue, Color.green, Color.yellow, Color.orange};
//		String[] colorNames = {"RED", "BLUE", "GREEN", "YELLOW", "ORANGE"};
		buttons = new ButtonInterfaceChu[numberOfButtons];
		for(int i = 0; i < numberOfButtons; i++ ){
			buttons[i] = getAButton();
			final ButtonInterfaceChu b = buttons[i];
		}
		
	}

}
