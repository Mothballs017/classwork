package Chatbot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public School(){
		
	}
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			ChuMain.print("Tell me about school.");
			schoolResponse = ChuMain.getInput();
			if(schoolResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
				ChuMain.talkForever();
			}
			else{
				ChuMain.print("That's my favorite " +
						"part about school too.");
			}
			
		}
	}

	public boolean isTriggered(String userInput) {
		//String[] triggers = {"school", "class", "teacher"};
		//you could usea for loop to iterate through the array
		if(ChuMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(ChuMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
