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
			int a[] = new int[n - 1];
			long mul = 1;
			for (int i = 0; i < n - 1; i++) 
			{
				a[i] = s.nextInt();
				mul = mul * a[i] % 1234567;
			}
			System.out.println(mul);
		}
		s.close();
	}
}
