import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
		}
		int q = s.nextInt();
		for (int i = 0; i < q; i++) 
		{
			int x = s.nextInt();
			int y = s.nextInt();
			if (a[x - 1] == 0 && x <= y || (a[x - 1] % 2 == 0 && a[x] != 0 && x <= y) || (a[x - 1] % 2 == 0 && x == y)) 
			{
				System.out.println("Even");
			} 
			else 
			{
				System.out.println("Odd");
			}
		}
		s.close();
	}
}
