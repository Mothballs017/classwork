package Arrays;

import java.util.Random;

public class ArraysMethod {
	
	static int[] numArray = new int[50];
	static int[] randomArray = new int[10];
	static int[] dieArray = new int[2];
	static int[] cardArray = new int[52];
	
	public static void main(String[] args) {
	
		//populateArray(numArray);
		//populateRandomArray(randomArray);
		//populateDieArray(dieArray);
		listDeck(cardArray);
	}
	
	private static void listDeck(int[] cardArray2) {
		String[] suitArray = {"Diamonds","Clubs","Hearts","Spades"};
		String[] valueArray = {"3","4","5","6","7","8","9","10","Jack","Queen","King","Ace","2"};
		for(int i = 0; i < cardArray2.length; i++){
			
		}
	}

	public static int randInt(int min, int max) {
		Random gen = new Random();
		int randomNum = gen.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	private static void populateRandomArray(int[] randomArray2) {
		for(int i = 0; i < randomArray2.length; i++){
			randomArray2[i] = randInt(0,100);
			System.out.println(randomArray2[i]);
		}
	}

	private static void populateArray(int[] someArray) {
		for(int i = 0; i < someArray.length; i++){
			someArray[i] = i + 1;
			System.out.println(someArray[i]);
		}
	}
	
	private static void populateDieArray(int[] array){
		
		for(int i = 0; i < array.length; i++){
			int firstRoll = randInt(1,6);
			int secondRoll = randInt(1,6);
			array[i] = firstRoll + secondRoll;
			System.out.println(array[i]);
		}
	}
	
	
}
