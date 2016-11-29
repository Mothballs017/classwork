package Sort;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name,int level){
//		A constructor that takes a String name and int level as a parameter, initializes these values, sets hp to 100 and poisoned to false.
//		A void method "iChooseYou" that prints the name of the Pokemon twice.
//		in getHP()
//		String getName()
//		void setHP(int newHP)
//		void setPoisoned(boolean b)
//		void lapse() which subtracts 15 points from hp only if the Pokemon is poisoned.
		hp = 100;
		this.name = name;
		this.level = level;
		this.poisoned = false;
	}
	
	public void iChooseYou(){
		System.out.println(name);
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned)hp-=15;
	}
	

}
