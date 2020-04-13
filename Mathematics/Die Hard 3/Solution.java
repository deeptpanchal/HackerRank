import java.util.*;

public class Solution 
{
	static int gcd(int a, int b) 
	{
		if (b == 0) 
		{
			return a;
		} 
		else 
		{
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if (c <= Math.max(a, b) && c % gcd(a, b) == 0) 
			{
				System.out.println("YES");
			} 
			else 
			{
				System.out.println("NO");
			}
		}
		s.close();
	}
}
