package Chatbot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolReponse;
	
	public School(){
		
	}
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			ChuMain.print("Tell me about school.");
			schoolReponse = ChuMain.getInput();
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

}
