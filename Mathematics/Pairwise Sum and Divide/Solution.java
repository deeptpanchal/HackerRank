import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			long n = s.nextLong();
			long a[] = new long[(int) n];
			long count_1 = 0;
			long count_2 = 0;
			for (long i = 0; i < n; i++) 
			{
				a[(int) i] = s.nextInt();
				if (a[(int) i] == 1) 
				{
					count_1++;
				}
				if (a[(int) i] == 2) 
				{
					count_2++;
				}
			}
			long ans = (n - 1) * count_1 + (count_2 * (count_2 - 1) / 2);
			System.out.println(ans);
		}
		s.close();
	}
}
