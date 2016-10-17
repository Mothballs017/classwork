package Arrays;

public class SampleElement {
	
	private int number;
	
	//constructor
	public SampleElement(int value){
		number = value;
	}
	
	public int getNumber(){
		return number;
	}
	
	//the value of number is stored as a field
	public void increase(){
		number++;
	}
}
