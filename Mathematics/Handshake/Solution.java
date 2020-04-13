import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int r = s.nextInt();
			System.out.println(r * (r - 1) / 2);
		}
		s.close();
	}
}
