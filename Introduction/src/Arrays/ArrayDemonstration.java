package Arrays;

import java.util.Arrays;
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
//		populateDieArray(dieArray);
//		populateResultsArray(dieArray);
//		printResults(resultsArray);
//		listDeck(cardArray);
//		System.out.println(checkHalfway(testArray,12,0,testArray.length-1));
//		swap(testArray,0,testArray.length-1);
//		if(checkHalfway(testArray,12,0,testArray.length-1)){
//			System.out.println("The number you are searching for is less than the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
//		}
		double[] decArr = {0.1,1.1,2.0,3.3,4.5};
		int[] arr = {3,9,6,11,3,9,6,11,14,16,11,3,11,3,9,6,11};
		int[] sub = {6,11};
		int[] subArr = getSubArray(arr,12,16);
//		int[] cycled = cycleOnce(arr);
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(cycled[i]);
//		}
//		System.out.println(countUnderBound(decArr,4.0));
//		System.out.println(Arrays.toString(subArr)+"");
		System.out.println(contains(arr, subArr));
		selectionSort(arr);
	}
	
	private static boolean contains(int[] arr, int[] subArray){
		for(int i = 0; i < arr.length; i++){
				int j = 0;
				while(j < subArray.length){
					if(subArray[j] == arr[i+j] && j == subArray.length -1){
						return true;
					}
					else if(subArray[j] != arr[i+j]){
						break;
					}
					j++;
				}
		}
		return false;
	}
	
	private static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] subArray = new int[endIndex - startIndex + 1];
		for(int i = 0; i < subArray.length; i++){
			subArray[i] = arr[startIndex+i];
		}
		return subArray;
	}
	
	//free!!!!
	private static void selectionSort(int[] array){
		System.out.println("Selection sort with "+Arrays.toString(array));
		for (int i = 0; i < array.length - 1; i++){
		    int tempLowIndex = i;
		    for (int j = i + 1; j < array.length; j++){
		        if (array[j] < array[tempLowIndex]){
		            tempLowIndex = j;
		        }
		    }
		   if(tempLowIndex!=i){
		         swap(array, tempLowIndex, i);
		        // System.out.println("becomes "+Arrays.toString(array));
		   } 
		   }//end for
		//System.out.println("Ends as "+Arrays.toString(array));
		}//end method
	
	public static int countUnderBound(double[] arr, double d){
		//returns number of elements in arr less than d
		int num = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < d){
				num++;
			}
		}
		return num;
		//to get median, (arr.length/2 - 1 + arr.length/2)/2
	}
	
	private static int[] cycleOnce(int[] array){
		for(int i = 0; i < array.length-1; i++){
			swap(array,i, i+1);
		}
		return array;
	}
	
	private static void shuffle(int[] arr) {
		for(int i = 0; i<arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	
	/**
	 * returns true if searchValue is less than element
	 * halfway between beginning and end
	 * @param testArray the int[] to be searched
	 * @param i
	 * @param j
	 * @param length
	 * @return
	 */

	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin+end+1)/2];
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
	private static void print(int[] arr) {
		for(int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}

}
