import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long m = s.nextLong();
		if (n % 2 == 0) 
		{
			System.out.println((n - 2) * 5 + 2 * (m - 1) + 1);
		} 
		else 
		{
			System.out.println((n - 1) * 5 + 2 * (m - 1));
		}
		s.close();
	}
}
