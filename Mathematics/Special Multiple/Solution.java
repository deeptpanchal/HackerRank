import java.util.*;

public class Solution 
{
	static long binary(long n) 
	{
		if (n == 1) 
		{
			return 1;
		} else if (n % 2 == 0) 
		{
			return 10 * binary(n / 2);
		} 
		else 
		{
			return 10 * binary(n / 2) + 1;
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		while (x-- > 0) 
		{
			long n = s.nextLong();
			long a = 1;
			long b = 9;
			while (b % n != 0) 
			{
				a++;
				b = binary(a);
				b = b * 9;
			}
			System.out.println(b);
		}
		s.close();
	}
}
