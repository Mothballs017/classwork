package Arrays;

public class ArrayPractice {
	static String[][] arr = new String[4][4];
	public static void main(String[] args){
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				arr[row][col] = "("+row+","+col+")";
			}
		}
		printArray(arr);
	}
	private static void printArray(String[][] arr){

		for(int i = 0; i < arr.length; i++){
			for(int k = 0; k < arr[i].length; k++){
				if(k != arr.length - 1){
					System.out.print(arr[i][k]+",");
				}
				else{
					System.out.println(arr[i][k]);
				}
			}
		}
	}
}