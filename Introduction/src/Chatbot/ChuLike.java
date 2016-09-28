package Chatbot;

public class ChuLike implements Topic{

	private boolean inLikeLoop;
	private String likeResponse;
	
	
	public void talk() {
		ChuMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = ChuMain.getInput();
			int likePsn = ChuMain.findKeyword(likeResponse, "like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				ChuMain.print("You must be pretty dull for liking " + thingsLiked);
				if(ChuMain.findKeyword(thingsLiked, "school", 0) >= 0){
					inLikeLoop = false;
					ChuMain.school.talk();
				}else{
				inLikeLoop = false;
				ChuMain.talkForever();
				}
			}else{
				ChuMain.print("I don't understand you.");
			}
		}
	}


	
	public boolean isTriggered(String userInput) {
		
		return false;
	}
	
}
