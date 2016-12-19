package saveAmy;
import java.util.List;
import java.util.ArrayList;
public class Primes
{
	private ArrayList<Integer> primeNumbers; 
	
	public static boolean isPrime(int num)
	{
		if(num <2)
		{
			return false;
		}
		if(num ==2)
		{
			return true;
		}
		if(num % 2== 0)
		{
			return false;
		}
		for(int i = 3; i * i <= num; i +=2)
			if(num % i==0) return false;
		return true;
	}
	
	public static int[] getPrimes(int start, int numberOfPrimes)
	{
		int [] primeNum = new int[numberOfPrimes];
		int count = 0;
		int position = 0;
		while (count < numberOfPrimes)
		{
			if(isPrime(position))
			{
				primeNum[count] = position;
				count++;
			}
			position++;
		}
		return primeNum; 
	
	}
	
	public static Object[] getPrimesWithinRange(int minValue, int maxValue)
	{
		ArrayList<Integer> primeNum = new ArrayList<Integer>();
		for(int i = minValue; i<= maxValue; i++)
		{
			if(isPrime(i))
			{
				primeNum.add(i);
			}
		}
		return primeNum.toArray(); //converts arraylist to an array(learnt from Brandon)
	}
	
	public ArrayList<Integer> getPrimesListWithinRange(int minValue, int maxValue)
	{
		ArrayList<Integer> primeNum =new ArrayList<Integer>();
		for(int i = minValue; i<= maxValue; i++)
		{
			if(isPrime(i))
			{
				primeNum.add(i);
			}
		}
		return primeNum;
	}
}
