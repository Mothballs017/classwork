package Datatypes;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args){
		int[] results = new int[6]; //[0, 0, 0, 0, 0, 0]
		int totalRolls = 10000;
		for(int index = 0;index < totalRolls; index++){
			int roll = rollUnFairDie();
			System.out.println("Roll #" + (index + 1) + ". Die is " + roll);
			results[roll - 1]++;
		}
		for(int i = 0; i < 6; i++){
			int percentage = (int) (1000 * (double) results[i] / totalRolls/10.0);
			System.out.println((i + 1) + " appeared " + percentage + "% of the time.");		
		}
	}

	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6) + 1;
		//		double rand = Math.random(); //cannot double (0.1)
		//		int roll = (int) (6 * rand); //[0-5] this is what above code does
		//		return roll + 1; //0 becomes 1 and 5 becomes 6
	}

	public static int rollUnFairDie(){
		Random gen = new Random();
		return gen.nextInt(3) + 4;
	}
}