import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long x = s.nextInt();
		for (long y = 0; y < x; y++) 
		{
			long r = s.nextInt();
			long k = s.nextInt();
			long count = 0;
			for (long i = 0; i < Math.sqrt(r); i++) 
			{
				double d = Math.sqrt(r - i * i);
				if (d - Math.floor(d) == 0) 
				{
					count = count + 4;
				}
			}
			if (k >= count) 
			{
				System.out.println("possible");
			} 
			else 
			{
				System.out.println("impossible");
			}
		}
		s.close();
	}
}
