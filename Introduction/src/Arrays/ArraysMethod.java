package Arrays;

import java.util.Random;

public class ArraysMethod {

	public static void main(String[] args) {
		/**
		 * IMPORTANT NOTE: 
		 * This homework assignment will be weighted 4x.
		 * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
		 * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
		 * DO NOT spend hours and hours trying to fix perfect code just because my test
		 * says that it isn't perfect!
		 * */
////		double[] arr = {1.0,2.0,3.0,4.0,5.0};
////		double[] arrT = getStats(arr);
////		for(double i: arrT){
////			System.out.println(i + "");
////		}
//		//		for(int i: newArr){
//		//			System.out.println(i + "");
//		//>>>>>>> branch 'master' of https://github.com/Mothballs017/classwork.git
//		//		}
//		//System.out.println(searchSorted(arr,3));
//		for(int i : generateDistinctItemsList(5)){
//			System.out.println(i+"");
//		}
	}

	public static int searchUnsorted(int[] arrayToSearch, int key){//fin
		//take array, for each item, if it equals key, add 1, add to repeat Array
		//for each item in repeat Array, if over 0, then print item -1;
		int index = 0;
		for(int i = 0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i] == key){
				index = i;
			}
		}
		/**
		 * this method take an unsorted int array (arrayToSearch) and returns an 
		 * int corresponding to the index of a key, if it is in the array
		 * if the key is not in the array, this method returns -1
		 * */
		if(arrayToSearch[index] == key){
			return index;
		}
		else{
			return -1;
		}
		//find out how to remove doubles
	}

	public static int searchSorted(int[] sortedArrayToSearch, int key){//fin
		/**
		 * this method is exactly like the one above, except the parameter sortedArrayToSearch will
		 * always be sorted in DESCENDING order. Again return the index of the key or return -1
		 * if the key is not in the array
		 * 
		 * Note: You should attempt to write a method that is more efficient that searchUnsorted
		 * */
		int index = -1;
		for(int i = 0; i < sortedArrayToSearch.length; i++){
			if(sortedArrayToSearch[i] == key){
				index = i;
			}

		}
		return index;
		//fix doubles
	}

	public static boolean isSorted(int[] array){//fin
		/**
		 * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
		 * */
		boolean[] sortArray = new boolean[array.length - 1];
		boolean descending = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i+1]) {
				sortArray[i] = true;
			}
			else{
				sortArray[i] = false;
			}
		}
		for(int k = 0; k < sortArray.length; k++){
			if(sortArray[k] == false){
				descending = false;
			}
		}
		return descending;
		//fix doubles
	}


	public static double[] getStats(double[] array){
		/** 
		 * This method return a double[] contain a WHOLE BUNCH of stats
		 * The double array must keep the following stats about the array parameter:
		 * index 0 = the mean
		 * index 1 = the max
		 * index 2 = the min
		 * index 3 = the median
		 * index 4 = the number of values greater than or equal to the mean
		 * index 5 = the number of values below the mean
		 * */
		double[] stats = new double[6];
		double[] arr = array;
		double mean = 0.0;
		double max = 0.0;
		double min = array[0];
		double median = 0.0;
		for(int i = 0; i < array.length; i++){
			mean = mean + array[i];
		}
		stats[0] = mean/array.length;
		for(int i=0; i< array.length; i++)
		{
			if(array[i] > max){
				max = array[i];
			}
			else if(array[i] < min){
				min = array[i];
			}
		}
		stats[1] = max;
		stats[2] = min;
		for(int i = 0; i < arr.length - 1; i++){
			int tempLowIndex = i;
			for (int j = i + 1; j < arr.length; j++){
				if (arr[j] < arr[tempLowIndex]){
					tempLowIndex = j;
				}
			}
			if(tempLowIndex!=i){
				dSwap(arr, tempLowIndex, i);
			} 
		}
		int middle = array.length/2;
		if (array.length%2 == 1) {
			median = array[middle];
		} else {
			median = (array[middle-1] + array[middle]) / 2.0;
		}
		stats[3] = median;
		stats[4] = dCountOverBound(arr,stats[0]);
		stats[5] = dCountUnderBound(arr,stats[0]);
		return stats;
	}

	public static void reverseOrder(int[] array){//fin
		/**
		 * this method reverses the order of the array passed to it.
		 * Not that this method does not have a return type. You do not need to copy the array first
		 * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
		 * in a random order, though you still need to reverse whatever order it is in
		 * 
		 * Example:
		 * array = {5, 1, 9, 10, 16, -6}
		 * after calling this method
		 * array = {-6, 16, 10, 9, 1, 5}
		 * 
		 * */
		for(int i = 1; i < (array.length+1)/2+1; i++){
			swap(array,i-1,array.length-i);
		}
		//see cycleOnce
	}

	public static int countDifferences(int[] array1, int[] array2){
		/**Here, you will write an method that returns the number of values in two arrays 
		 * that are NOT the same (either in value OR location).
		 * The arrays ALWAYS have the same length
		 * Examples:
		 * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
		 * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
		 * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
		 * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
		 * 
		 * */
		int diff = 0;
		for(int i = 0; i < array1.length; i++){
			if(array1[i] != array2[i]){
				diff++;
			}
		}
		return diff;
	}


	public static int longestConsecutiveSequence(int[] array1){
		/**This method counts the longest consequtive sequence in an array.
		 * It does not matter where the sequence begins
		 * If there are no consecutive numbers, the method should return '1'
		 * 
		 * Examples:
		 * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		 * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		 * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		 * */
		int maxed = 1;
		int onSeq = 1;
		for(int i = 0; i < array1.length -1; i++){
			if(array1[i] == array1[i+1]-1){
				onSeq++;
			}
			else{
				onSeq = 1;
			}
			if(onSeq > maxed){
				maxed = onSeq;
			}
		}
		return maxed;
	}

	public static int longestSharedSequence(int[] array1, int[] array2){//fin
		/**This method counts the longest unbroken, shared sequence in TWO arrays.
		 * The sequence does NOT have to be a consecutive sequence
		 * It does NOT matter where the sequence begins, the arrays might not be the same length
		 * 
		 * Examples:
		 * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
		 * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
		 *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
		 * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
		 * */
		int longest = 1; 
		boolean isSequence = false; 
		int seqLength = 0; 
		if(array1.length > array2.length){
			for(int i = 0; i < array1.length; i++){ 
				for(int j = 0; j < array2.length; j++){ 
					//System.out.println("j = " + j + " i = " + i); 
					if(array1[i] == array2[j]){
						isSequence = true; 
					}
					else{ 
						isSequence = false; 
					}
					//System.out.println(isSequence); 
					if(isSequence){ 
						seqLength ++; 
						i++; 
						//System.out.println("seqLength = " + seqLength); 
					}
					else if(seqLength > longest){ 
						longest = seqLength; seqLength = 0; 
					}
					else{ 
						seqLength = 0; 
					} 
				} 
			} 
		}
		else{ 
			for(int i = 0; i < array2.length; i++){ 
				for(int j = 0; j < array1.length; j++){ 
					//System.out.println("j = " + j + " i = " + i); 
					if(array2[i] == array1[j]){ 
						isSequence = true; 
					}
					else{ 
						isSequence = false; 
					} 
					//System.out.println(isSequence); 
					if(isSequence){ 
						seqLength ++; 
						i++; 
						//System.out.println("seqLength = " + seqLength); 
					}
					else if(seqLength > longest){ 
						longest = seqLength; seqLength = 0; 
					}
					else{ 
						seqLength = 0; 
					} 
				} 
			} 
		} 
		if(seqLength > longest){ 
			return seqLength; 
		}
		else{ 
			return longest; 
		} 
	}

	public static int[] generateDistinctItemsList(int n){//fin
		/**
		 * This method needs to generate an int[] of length n that contains distinct, random integers
		 * between 1 and 2n 
		 * The method will be tested by verifying that the array you return is n items long,
		 * contains only entries between 1 and 2n (inclusive) and has no duplicates
		 * 
		 * */
		int[] listed = new int[2*n];
    	int[] array = new int[n];
    	int randNum = 0;
    	for(int i = 0; i < listed.length; i++){
    		listed[i] = i+1;
    	}
    	for(int i = 0; i < array.length; i++){
    		randNum = (int)Math.random()*(listed.length);
    		array[i] = listed[randNum];
    		listed = removeInt(randNum, listed);
    	}
        return array;
		
	}


	public static void cycleThrough(int[] array, int n){//fin
		/** This problem represents people moving through a line.
		 * Once they get to the front of the line, they get what they've been waiting for, then they 
		 * immediately go to the end of the line and "cycle through" again.
		 * 
		 * This method reorders the array so that it represents what the array would look like
		 * after it had been cycled through an n number of times.
		 * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
		 * because '2' (the person at the front of the line) cycled through and is now at the end of the line
		 * 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
		 * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
		 * 
		 * Likewise,
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
		 * and the most interesting case, 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
		 * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
		 * was able to go through one more time than anyone else
		 * 
		 * CHALLENGE
		 * For extra credit, make your method handle NEGATIVE n
		 * */
		for(int i = 0; i < n; i++){
			cycleOnce(array);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	private static void dSwap(double[] arr, int i, int j) {
		double placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	private static int[] cycleOnce(int[] array){
		for(int i = 0; i < array.length-1; i++){
			swap(array,i, i+1);
		}
		return array;
	}
	private static double dCountOverBound(double[] arr, double d){
		double num = 0.0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > d){
				num++;
			}
		}
		return num;
	}
	private static double dCountUnderBound(double[] arr, double d){
		double num = 0.0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < d){
				num++;
			}
		}
		return num;
	}
    private static int[] removeInt(int num, int[] array){
    	int[] arr = new int[array.length - 1];
    	for(int i = 0; i < num; i++){
    		arr[i] = array[i];
    	}
    	for(int k = num + 1; k < array.length; k++){
    		arr[k-1] = array[k];
    	}
    	return arr;
    }
}


