import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			long n = s.nextLong();
			long m = s.nextLong();
			long sum = 0;
			if (n < m) 
			{
				sum = n * (n + 1) / 2;
			} 
			else if (n == m) 
			{
				sum = n * (n - 1) / 2;
			}
			else 
			{
				sum = n / m;
				sum = sum * m * (m - 1) / 2;
				sum = sum + (n % m) * (n % m + 1) / 2;
			}
			System.out.println(sum);
		}
		s.close();
	}
}
