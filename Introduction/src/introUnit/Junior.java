package introUnit;

public class Junior extends Student {

	private String test;
	
	public Junior(String name, String test) {
		super(name);
		this.test = test;
	}
	
	public void talk(){
		super.talk(); //call the super method
		System.out.println("... and I am a junior!");
		System.out.println("I took the " + test + ".");
	}
	//control + / over highlighted area = commented out portion
}