import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int prime[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
		for (int y = 0; y < x; y++) 
		{
			long n = s.nextLong();
			if (n == 1) 
			{
				System.out.println("0");
			} 
			else 
			{
				long mul = 1;
				int count = 0;
				for (int i = 0; i < prime.length; i++) 
				{
					mul = mul * prime[i];
					if (mul <= n) 
					{
						count++;
					} 
					else 
					{
						break;
					}
				}
				System.out.println(count);
			}
		}
		s.close();
	}
}
