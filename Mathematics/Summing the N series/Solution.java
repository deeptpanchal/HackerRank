import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			Long t = s.nextLong();
			t = t % 1000000007;
			t = t * t;
			t = t % 1000000007;
			System.out.println(t);
		}
		s.close();
	}
}
