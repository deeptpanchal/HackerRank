import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for (int x = 0; x < q; x++) 
		{
			int n = s.nextInt();
			int a[][] = new int[n][2];
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < 2; j++) 
				{
					a[i][j] = s.nextInt();
				}
			}
			int x_min = Integer.MAX_VALUE;
			int y_min = Integer.MAX_VALUE;
			int x_max = Integer.MIN_VALUE;
			int y_max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) 
			{
				if (x_min >= a[i][0]) 
				{
					x_min = a[i][0];
				}
				if (y_min >= a[i][1]) 
				{
					y_min = a[i][1];
				}
				if (x_max <= a[i][0]) 
				{
					x_max = a[i][0];
				}
				if (y_max <= a[i][1]) 
				{
					y_max = a[i][1];
				}
			}
			boolean b = true;
			for (int i = 0; i < n; i++) 
			{
				if (!(a[i][0] == x_min || a[i][1] == y_min || a[i][0] == x_max || a[i][1] == y_max)) 
				{
					b = false;
					break;
				}
			}
			if (b) 
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
