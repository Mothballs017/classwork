package gui.whackAMole;

import gui.Components.Action;
import gui.Components.Clickable;

/**
 * 
 * @author Student 6
 * This is for my partner, the Enemy Designer, to implement
 */
public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);

}
