import java.util.*;

public class Solution 
{
	public static void main(String srga[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		long mul = 1;
		for (int i = 0; i < n; i++) 
		{
			a[i] = s.nextInt();
			mul = mul * (1 + a[i]);
			mul = mul % 1000000007;
		}
		System.out.println(mul - 1);
		s.close();
	}
}
