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
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		for(int row = 7; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "W";
			}
		}
		
		printMan();
		printBird();
		printHouse();
		printSun();
		
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		for(int row = 0; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] = "|";
		}
		
		printPic(pic);
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
	public static void printPic(String[][] pic) {
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
		
	}
	
	
}