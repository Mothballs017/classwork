package Chatbot;

import java.util.Scanner;

public class ChuMain {
	
		static Scanner input;
		static String user;
		static int lineCount;
		static boolean inLoop;
		static String response;
		static Topic school;
		
		public static void main(String[] args) {
			createTopics();
			lineCount = 0;
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
				if(findKeyword(response, "good", 0)){
					print("I'm so happy you're good.");
				}//.equals would have only been the word good
				//indexOf means if it includes "good"
				else if(response.indexOf("school") >= 0){
					inLoop = false; //exit this loop
					school.talk();
				}
				else{
					print("I'm sorry. I don't understand you.");
				}
			}
		}
		
		private static boolean findKeyword(String searchString, String key, int startIndex) {
			//delete white space
			String phrase = searchString.trim();
			//set all letters to lower case
			phrase = phrase.toLowerCase();
			key = key.toLowerCase();
			//find positions of key
			int psn = phrase.indexOf(key);
			//keep looking for the word until we find the right context
			while(psn >= 0){
				String before = " ";
				String after = " ";
				//if the phrase does not end with that word
				if(psn + key.length() < phrase.length()){
					after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
				}
				//if the phrase does not begin with this word
				if(psn > 0){
					before = phrase.substring(psn - 1, psn).toLowerCase();
				}
				if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
					return true;
				}
				//in case keyword was not found yet
				//check the rest of the string
				psn = phrase.indexOf(key, psn + 1);
			}
			return false;
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
		
		public static void createTopics() {
			input = new Scanner(System.in);
			school = new School();
		}
		
		
}

		
