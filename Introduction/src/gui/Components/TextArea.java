package gui.Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	private String text;
	private String font;
	private int size;
	
	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}

	public void update(Graphics2D g) {
		g = clear(); //delete previous text
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		//renderinghints makes it look nice
		g.setColor(Color.black);
		g.setFont(new Font(font,Font.PLAIN,size));
		FontMetrics fm = g.getFontMetrics();
		String[] words = getText().split(" ");//splits word at every space
		//w = 80
		//h = 40
		if(getText()!= null){
			g.setColor(Color.white);
			String t = getText();
			//just in case text is too wide, cut off
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff --;
				t = t.substring(0,cutoff); 
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, 
					(getHeight()+fm.getHeight()-fm.getDescent())/2);
		}
}
}
