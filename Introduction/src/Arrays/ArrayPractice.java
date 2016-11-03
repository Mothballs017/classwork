package Arrays;

public class ArrayPractice {
	static String[][] arr = new String[4][4];
	static String[][] pic = new String[10][12];
	public static void main(String[] args){
		//		for(int row = 0; row < arr.length; row++){
		//			for(int col = 0; col < arr[row].length; col++){
		//				arr[row][col] = "("+row+","+col+")";
		//			}
		//		}
		//		printArray(arr);

		boolean[][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPic(field);
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col])field[row][col] = "X";
				else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
//		r and c represent coordinates of element
//		we are providing a String for
		int count = 0;
//		loop through row above to row below
		for(int row = r - 1; row <= r+1; row++){
//			loop through col left to col right
			for(int col = c - 1; col <= c + 1; col++){
//				exclude this element when counting
				if(row != r && col != c){
					if(row >= 0 &&)
				}
			}

		}
		return null;
	}

	private static void printSun(){
		pic[1][2] = "O";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
	}

	private static void printHouse() {
		pic[4][3] = "/";
		pic[4][5] = "\\";
		pic[5][3] = "|";
		pic[5][4] = "o";
		pic[5][5] = "|";
		pic[6][3] = "|";
		pic[6][4] = "n";
		pic[6][5] = "|";
	}

	private static void printBird() {
		pic[1][6] = "/";
		pic[1][7] = "v";
		pic[1][8] = "\\";
	}

	private static void printMan(){
		pic[4][8] = "0";
		pic[5][8] = "|";
		pic[5][7] = "/";
		pic[5][9] = "\\";
		pic[6][7] = "/";
		pic[6][9] = "\\";

	}
	//	private static void printArray(String[][] arr){
	//
	//		for(int i = 0; i < arr.length; i++){
	//			for(int k = 0; k < arr[i].length; k++){
	//				if(k != arr.length - 1){
	//					System.out.print(arr[i][k]+",");
	//				}
	//				else{
	//					System.out.println(arr[i][k]);
	//				}
	//			}
	//		}
	//	}

	public static void printImage(String[][] pic){
		printMan();
		printBird();
		//printHouse();
		printSun();

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
		for(int row1 = 7; row1 < pic.length; row1++){
			for(int col = 0; col < pic[row1].length; col++){
				pic[row1][col] = "W";
			}
		}
	}
	public static void printPic(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
	}

}