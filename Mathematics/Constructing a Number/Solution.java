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
			int a[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) 
			{
				a[i] = s.nextInt();
				sum = sum + a[i];
				sum = sum % 3;
			}
			if (sum == 0) 
			{
				System.out.println("Yes");
			} 
			else 
			{
				System.out.println("No");
			}
		}
		s.close();
	}
}
