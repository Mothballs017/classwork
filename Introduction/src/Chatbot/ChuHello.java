package Chatbot;

public class ChuHello implements Topic{

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	private static String[] calmResponses = {"We've already said our hellos. Remember?",
			"Yes, hello to you too. Let's actually chat."
	};
	
	private static String[] angryResponses = {"Okay, seriously. This has to stop.",
			"You're beginning to annoy me! We've said 'Hello!'"
	};
	
	public ChuHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = ChuMain.getInput();
			//! is used for negation
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				ChuMain.talkForever();
			}
		}
		
	}

	private void printResponse() {
		int responseIndex = 0;
		//calm response
		if(helloCount >= 5){
			responseIndex = (int)(Math.random() * calmResponses.length);
			ChuMain.print(calmResponses[responseIndex]);
		}
		//angry response
		else{
			responseIndex = (int)(Math.random() * angryResponses.length);
			ChuMain.print(angryResponses[responseIndex]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(ChuMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(ChuMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		return false;
	}

}
