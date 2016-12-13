package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.Components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
//		smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.pink);
//		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.yellow);
//		g.drawString("Hello World", 40, 100);
//		g.drawOval(22, 70, 100, 50);
//		for(int i = 0; i<viewObjects.size(); i++){
//		
//		}
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
}
//				Array				ArrayList
//												v wrapper class
//declaration	int[] numbs			ArrayList<Integer> numbs;
//					^primitive type
//instantiation	nums = new int[5]	nums = new ArrayList<Integer>();\
//										v appends to List increases size
//adding items	num[i] = 4;			nums.add(new Integer(5));
//					^overrides element at  
//length/size	nums.length;		nums.size();
//