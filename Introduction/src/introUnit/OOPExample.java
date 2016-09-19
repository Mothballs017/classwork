/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 * This class is designed to contrast with the ProceduralExample. It embodies an Object-Oriented approach
 * 
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian", "programmer");
		Student jordan = new Junior("Jordan", "SAT");
		Student jason = new Student("Jason");
		jillian.talk();
		
		jordan.talk();
		jason.talk();
	}

}
