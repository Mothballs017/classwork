package saveAmy;
import java.util.List;
import java.util.ArrayList;
public class TestFile extends Primes
{
	public static void main(String[]args)
	{
		int[] numbers = {5,4,8,6};
		for(int n : numbers)
		{
			System.out.println(n + "isPrime? =" + isPrime(n));
		}
	}
}
