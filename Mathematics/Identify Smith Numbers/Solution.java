import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) 
		{
			sum = sum + i % 10;
		}
		for (int i = 2; i <= n; i++) 
		{
			while (n % i == 0) 
			{
				for (int j = i; j > 0; j = j / 10) 
				{
					sum = sum - j % 10;
				}
				n = n / i;
			}
		}
		if (sum == 0) 
		{
			System.out.println("1");
		} 
		else 
		{
			System.out.println("0");
		}
		s.close();
	}
}
