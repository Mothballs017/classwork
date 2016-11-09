package caveExplorer;

import java.util.Arrays;

public class CaveMapTest {

	static String[][] pic = new String[10][13];

	public static void main(String[] args){
		printImage(pic);
		
		printPic(pic);
	}
	
	public static void printImage(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		for(int row2 = 0; row2 < pic.length; row2++){
			for(int col2 = 0; col2 < pic[0].length; col2++){
				if(col2%2==1)pic[row2][col2] = "_";
				if(col2%2==0)pic[row2][col2] = "|";
			}
		}
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
			if(col%2==0){
				pic[0][col] = " ";
				pic[pic.length-1][col] = "|";
			}
		}
		for(int row1 = 0; row1 < pic.length; row1++){
			pic[row1][0] = "|";
			pic[row1][pic[0].length - 1] = "|";
		}
		pic[0][0] = " ";
		pic[0][pic[0].length-1] = " ";
	}
	public static void printPic(String[][] pic){
		
		for(int row1 = 0; row1 < pic.length; row1++){
			for(int col = 0; col < pic[row1].length; col++){
				System.out.print(pic[row1][col]);
			}
			System.out.println();
		}
	}
}