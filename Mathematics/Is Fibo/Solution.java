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
			long a = 0;
			long b = 1;
			long c = 0;
			while (c != n && c <= n) 
			{
				c = a + b;
				a = b;
				b = c;
			}
			if (c == n) 
			{
				System.out.println("IsFibo");
			} 
			else {
				
				System.out.println("IsNotFibo");
			}
		}
		s.close();
	}
}
