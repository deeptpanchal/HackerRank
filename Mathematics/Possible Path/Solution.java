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
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			if (gcd(x1, y1) == gcd(x2, y2)) 
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
