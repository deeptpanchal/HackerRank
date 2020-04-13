import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int x = 0; x < N; x++) 
		{
			int n = s.nextInt();
			int k = s.nextInt();
			int a[] = new int[n];
			int t1 = n - 1;
			int t2 = 0;
			for (int i = 0; i < n; i++) 
			{
				if (i % 2 == 0) 
				{
					a[i] = t1;
					t1--;
				} 
				else 
				{
					a[i] = t2;
					t2++;
				}
			}
			for (int i = 0; i < n; i++) 
			{
				if (a[i] == k) 
				{
					System.out.println(i);
					break;
				}
			}
		}
		s.close();
	}
}
