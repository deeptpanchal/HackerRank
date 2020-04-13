import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			long n = s.nextLong();
			int count = 0;
			for (long i = 2; i <= Math.sqrt(n); i++) 
			{
				if (n % i == 0 && i % 2 == 0) 
				{
					count++;
				}
				if (n % (n / i) == 0 && ((n / i) != i) && ((n / i) % 2 == 0)) 
				{
					count++;
				}
			}
			if (n % 2 == 0) 
			{
				count++;
			}
			System.out.println(count);
		}
		s.close();
	}
}
