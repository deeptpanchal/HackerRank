import java.util.*;

public class Solution 
{
	static long power(int m) 
	{
		long a = 1;
		for (int i = 1; i <= m; i++)
		{
			a = a * 2 % 1000000007;
		}
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int odd = 0;
		int even = 0;
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
			if (a[i] % 2 == 0) 
			{
				even++;
			} 
			else 
			{
				odd++;
			}
		}
		System.out.println((long) (power(even) * power(odd - 1) - 1) % 1000000007);
		s.close();
	}
}
