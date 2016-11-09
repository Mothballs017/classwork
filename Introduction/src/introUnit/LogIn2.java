package introUnit;

import java.util.Scanner;

public class LogIn2 {
	
	static Scanner input = new Scanner(System.in);

	public static String waitForEntry(){
		return input.nextLine();
	}
	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args){
		if(correctUser()){
			checkPassword();
		}
		else{
			System.out.println("Unknown username. Please contact network administrator");
		}
	}

	private static boolean correctUser() {
		System.out.println("enter your username");
		return waitForEntry().equals(username);
	}

	private static void checkPassword() {
		boolean passLoop = true;
		int triesLeft = 3;
		while(passLoop){
			System.out.println("enter password");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("Logged in as test_user");
				passLoop = false;
			}
			else{
				if(triesLeft == 0){
					System.out.println("invalid password");
				}
				else{
					triesLeft--;
					System.out.println("Incorrect entry. You have " + triesLeft + " tries left.");
				}
			}
		}
	}
}
