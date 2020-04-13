import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int max_i = 0;
		for (int i = 1; i <= n; i++) 
		{
			if (n % i == 0) 
			{
				int sum = 0;
				for (int j = i; j > 0; j = j / 10) 
				{
					sum = sum + j % 10;
				}
				if (max_i < sum) 
				{
					max_i = sum;
					ans = i;
				}
				if (max_i == sum) 
				{
					ans = Math.min(i, ans);
				}
			}
		}
		System.out.println(ans);
		s.close();
	}
}
