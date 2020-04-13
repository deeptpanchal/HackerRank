import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b, c;
		if (a % 2 == 1) 
		{
			b = (a * a - 1) / 2;
			c = (a * a + 1) / 2;
		} 
		else 
		{
			b = (a * a - 4) / 4;
			c = (a * a + 4) / 4;
		}
		System.out.println(a + " " + b + " " + c);
		s.close();
	}
}
