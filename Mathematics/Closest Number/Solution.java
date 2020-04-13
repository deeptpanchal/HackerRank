import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) 
		{
			long a = s.nextInt();
			long b = s.nextInt();
			long c = s.nextInt();
			long d = (long) Math.pow(a, b) + c / 2;
			System.out.println(d - (d % c));
		}
		s.close();
	}
}
