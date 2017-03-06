package introUnit;

public class Item {
	
	private String description;
	private boolean purchased;
	
	public Item(String d) {
		this.description = d;
		this.purchased = false;
	}


	public void setPurchased(boolean b){
		this.purchased = b;
	}
	
	public String getDescription(){
		return description;
	}
	
	public boolean isPurchased(){
		return purchased;
	}
}
