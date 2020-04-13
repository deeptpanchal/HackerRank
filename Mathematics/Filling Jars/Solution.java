import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		long sum = 0;
		long avg = 0;
		for (int y = 0; y < q; y++) 
		{
			long a = s.nextLong();
			long b = s.nextLong();
			long c = s.nextLong();
			sum = sum + (b - a + 1) * c;
			avg = sum / n;
		}
		System.out.println(avg);
		s.close();
	}
}
