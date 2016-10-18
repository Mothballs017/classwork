package Arrays;

import java.util.Random;

public class ArrayDemonstration {

	static int[] numArray = new int[50];
	static int[] randomArray = new int[10];
	static int[] dieArray = new int[10000];
	static int[] resultsArray = new int[11];
	static String[] cardArray = new String[52];

	public static void main(String[] args) {

//		populateArray(numArray);
//		populateRandomArray(randomArray);
		populateDieArray(dieArray);
		populateResultsArray(dieArray);
		printResults(resultsArray);
//		listDeck(cardArray);
		
	}

	private static void listDeck(String[] cardArray2) {
		int cardcntr = 0;
		String card = "";
		String[] suitArray = {"Diamonds","Clubs","Hearts","Spades"};
		String[] valueArray = {"3","4","5","6","7","8","9","10","Jack","Queen","King","Ace","2"};
		for(int k = 0; k < suitArray.length; k++){
			for(int m = 0; m < valueArray.length; m++){
				card = valueArray[m] + " of " + suitArray[k];
				cardArray2[cardcntr] = card;
				cardcntr++;
			}
		}
		for(String c: cardArray2){
			System.out.println(c+"");
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
			//System.out.println(array[i]);
		}
	}
	
	private static void populateResultsArray(int[] numsRolled){

		for(int i = 0; i < numsRolled.length; i++){
			resultsArray[numsRolled[i]-2]++;
		}
	}
	
	private static void printResults(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(i+1+" is rolled "+((double) array[i]/dieArray.length*100)+"% of the time.");
		}
	}

}
