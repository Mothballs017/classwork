package Datatypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static String response;
	
	public static void main(String[] args) {
		createAScanner();
		lineCount = 0;
		demonstrateStringMethods();
		promptName();
		talkForever();
	}
	
	private static void promptName(){
		print("Hello, human!"
				+ " I am a board covered with semiconductors"
				+ " and other such components." 
				+ " What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " 
				+ user 
				+ " until you terminate me!");
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + user + ". How are you?");
			response = getInput();
			if(response.indexOf("good") >= 0){
				print("I'm so happy you're good.");
			}//.equals would have only been the word good
			//indexOf means if it includes "good"
			else{
				print("I'm sorry. I don't understand you.");
			}
		}
	}
	
	public static void promptInput(){
		print(user + ", try inputting a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	
	public static void print(String s){
	//	lineCount++;
		//System.out.println("Line #" + lineCount + ": " + s);
		//create a multiline String
		String printString = "";
		int cutoff = 35;
		//check if there are words to add
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less
			//than the cutoff and there are still words to add
			//, do the following loop
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//checks to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
			
		}
			
		System.out.println(printString);	
	}
	
	public static void createAScanner() {
		input = new Scanner(System.in);
		
	}
	
	public static void demonstrateStringMethods(){
//		String text = new String("Hello World");
		String text1 = "Hello World"; //same as above because Strings have their own contructors and dont need "new"
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2 + text3)){//double = doesnt work for combining Strings
		System.out.println("These strings are equal.");
		}
		
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2" + " lexicongraphically.");
		}
	}
}