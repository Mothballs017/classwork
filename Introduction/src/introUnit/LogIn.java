package introUnit;

import java.util.Scanner;

public class LogIn {

	static Scanner input = new Scanner(System.in);

	public static String waitForEntry(){
		return input.nextLine();
	}

	//1 point for "private" or inaccessible
	//1 point for declaration of data type (String)
	private static String username = "test_user";
	private static String password = "test";

	//1 point correct method header
	public static void main(String[] args){
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown username. Please contact network administrator");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		while(inLoop){
			System.out.println("Enter password.");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in!");
				inLoop = false;
			}
			else{
				remainingTries--;
				if(remainingTries==0){
					System.out.println("Invalid password");
					inLoop = false;
				}
				else{
					System.out.println("Incorrect password. You have "+remainingTries+" tries left.");
				}
			}
		}
	}

	private static boolean correctUser() {
		//System.out.println("Enter username.");
		////waitForEntry.equals for Strings
		//if(waitForEntry().equals(username)){
		//	return true;
		//}
		//return false;
		System.out.println("Enter username.");
		return waitForEntry().equals(username);
	}
}
