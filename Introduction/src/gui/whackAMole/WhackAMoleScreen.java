package gui.whackAMole;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import gui.Components.Action;
import gui.Components.TextLabel;
import gui.Components.Visible;
import gui.screens.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}
	
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		moles = new ArrayList <MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"Batman");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}
	
	/**
	 * This method is a placeholder until our "partner"
	 * finishes the design of the Players. For the time being,
	 * it returns "null". This mean our code wont work until 
	 * our partner is done, BUT at least our code will compile
	 * 
	 * DONT FORGET TO CHANGE THIS ONCE YOUR PARTNER IS DONE!
	 * @return
	 */
	public PlayerInterface getAPlayer(){
		return new Player();
	}
	
	public MoleInterface getAMole(){
		return new Mole((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
	}
	
	public void run() {
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		label.setText("");
		//since this is a timed game, we will use a while 
		//loop. This is not necessary for games that 
		//aren't timed
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		double chance = (Math.random()*.1)*(60-timeLeft)/60;
		if(Math.random() < chance){
			//create a mole
		final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i< moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m);//remove from screen
				moles.remove(m);
				i--;//compensate for removal
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timeLeft -= 0.1;
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
		//.1 is not a clean number in binary
		//so to fix the output, we use this little formula^^
		//to round to the nearest tenth
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
