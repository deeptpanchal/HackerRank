import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			int n = s.nextInt();
			System.out.println((long) (n / 2) * (n / 2 + n % 2));
		}
		s.close();
	}
}
