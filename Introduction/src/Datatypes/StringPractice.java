package Datatypes;

public class StringPractice {

	public static void main(String[] args) {
//		String text = new String("Hello World");
		String text1 = "Hello World"; //same as above because Strings have their own contructors and dont need "new"
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2 + text3)){//double = doesnt work for combining Strings
		System.out.println("These strings are equal.");
		}
		
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2" + " lexicongraphically.");
		}
	}
}