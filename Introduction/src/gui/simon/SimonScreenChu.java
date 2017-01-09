package gui.simon;

import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import gui.Components.Action;
import gui.Components.TextLabel;
import gui.Components.Visible;
import gui.screens.ClickableScreen;

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
		int randButton = (int)(Math.random()*buttons.length);
		if(randButton != lastSelectedButton){
			b = buttons[randButton];
		}
		else{
			while(randButton == lastSelectedButton){
				randButton = (int)(Math.random()*buttons.length);
			}
		}
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
		buttons = new ButtonInterfaceChu[numberOfButtons];
		for(int i = 0; i < numberOfButtons; i++ ){
			buttons[i] = getAButton();
			final ButtonInterfaceChu b = buttons[i];
			b.setColor(colors[0]);
			b.setY(40);
			b.setX(50);
			b.setAction(new Action(){
				public void act(){
					if(acceptingInput){
						Thread blink = new Thread(new Runnable(){
							public void run(){
								b.highlight();
								Thread dim = new Thread(new Runnable(){

									@Override
									public void run() {
										// TODO Auto-generated method stub
										
									}
									
								});
							}
						});
						blink.start();
					}
				}
			});
		}

	}

	private ButtonInterfaceChu getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

}
