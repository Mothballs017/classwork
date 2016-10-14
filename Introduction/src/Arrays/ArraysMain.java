package Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you quickly start a computer processes.
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to "+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in "+(endTime-startTime)+ " milliseconds.");
	}
	
	private static void passByValueDemonstration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		int ten = 10;
		increase(ten);
		System.out.println("Ten, increased, is "+ ten);
		
		//in this variable, we pass the ELEMENT
		//(a variable) not the array, so
		//no change will be made
		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \"changeString\" method "+someStrings[99]);
		
		changeArray(someStrings);
		System.out.println("After \"changeArray\" method "+someStrings[99]);
		
		changeArrayElement(someStrings,99);
		System.out.println("After \"changeArrayElement\" method "+someStrings[99]);
		
		//printArray(someStrings);
	}
	
	private static void changeArrayElement(String[] someStrings, int i){
		someStrings[i] = "new item "+(i+1);
	}

	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item "+(i+1);
		}
	}
	
	//this method does nothing, since local variables
	//are destroyed after the method is complete
	private static void increase(int ten) {
		ten = ten + 1;
	}

	private static void changeString(String s){
		s = "This string has been changed!";
	}

	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
	}

	private static void populateArray(String[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] = "value " + (index + 1);
		}
	}

	public static void arrayIntroMethod() {
		//cant search an array through indexOf
		//construct two integer arrays
		//primitive type arrays filled with ZEROES 0, 0.0, false
		//	int[] zeros1 = {0,0,0};
		//	int[] zeros2 = new int[3];
		//these two methods do the same thing

		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//FIRST METHOD: "FOR LOOP"
		//	- the index of the data is important to reference
		// 	- you need to customize how you iterate
		//(increase by 2, backwards, etc...)
		for(int index = 0; index < booleans.length; index++){
			System.out.println(index+") "+booleans[index]);
		}
		//SECOND METHOD: "FOR-EACH"
		//always goes in order, does to keep track of index
		//easier to type
		//	int index = 0;
		for(boolean b: booleans){
			//		System.out.println(index+") "+b);
			//		index++;
			System.out.println(b+"");
		}

		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];
		//these two constructors are different
		//		strings2[0] = "value 1";
		//		strings2[1] = "value 2";
		//		strings2[2] = "value 3";
		//
		//		for(String s: strings1){
		//			System.out.println(s);
		//		}
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value " + (index + 1);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}