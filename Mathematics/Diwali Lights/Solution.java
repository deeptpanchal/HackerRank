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
			long ans = 1;
			for (int i = 0; i < n; i++) 
			{
				ans = ans * 2 % 100000;
			}
			System.out.println(ans - 1);
		}
		s.close();
	}
}
