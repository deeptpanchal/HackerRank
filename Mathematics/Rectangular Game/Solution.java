import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][] = new int[n][2];
		int min_i = Integer.MAX_VALUE;
		int min_j = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			a[i][0] = s.nextInt();
			a[i][1] = s.nextInt();
			if (min_i > a[i][0]) 
			{
				min_i = a[i][0];
			}
			if (min_j > a[i][1]) 
			{
				min_j = a[i][1];
			}
		}
		System.out.println((long) min_i * min_j);
		s.close();
	}
}
