import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][] = new int[n][2];
		for (int i = 0; i < n; i++) 
		{
			a[i][0] = s.nextInt();
			a[i][1] = s.nextInt();
		}
		int count_x = 1;
		int count_y = 1;
		for (int i = 0; i < n - 1; i++) 
		{
			if (a[i][0] == a[i + 1][0]) 
			{
				count_x++;
			}
			if (a[i][1] == a[i + 1][1]) 
			{
				count_y++;
			}
		}
		if (count_x == n || count_y == n) 
		{
			System.out.println("YES");
		} 
		else 
		{
			System.out.println("NO");
		}
		s.close();
	}
}
