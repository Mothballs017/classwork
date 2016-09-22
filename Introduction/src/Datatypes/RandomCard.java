package Datatypes;

import java.util.Random;

public class RandomCard {

	public static void main(String[] args) {
		String[] value = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suite = {"Diamonds", "Clubs", "Hearts", "Spades"};
		
		int card = drawCard();
		int set = selectSuite();
		
		System.out.println("The " + value[card] + " of " + suite[set] + ".");
		
	}
	
	public static int drawCard(){
		double rand = Math.random();
		int roll = (int)(13 * rand);
		return roll + 1;
	}
	
	public static int selectSuite(){
		Random gen = new Random();
		return gen.nextInt(4) + 1;
	}

}
