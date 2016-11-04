package caveExplorer;

import java.util.Arrays;

public class CaveMapTest {

	static String[][] pic = new String[10][12];

	public static void main(String[] args){
		
		printImage(pic);
	}
	public static void printImage(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		for(int row1 = 0; row1 < pic.length; row1++){
			pic[row1][0] = "|";
			pic[row1][pic[0].length - 1] = "|";
		}

		for(int row1 = 0; row1 < pic.length; row1++){
			for(int col = 0; col < pic[row1].length; col++){
				System.out.print(pic[row1][col]);
			}
			System.out.println();
		}
	}
}