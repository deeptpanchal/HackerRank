import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int x = 0; x < n; x++) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int hcf = 0;
			for (int i = 1; i <= a || i <= b; i++) 
			{
				if (a % i == 0 && b % i == 0) 
				{
					hcf = i;
				}
			}
			a = a / hcf;
			b = b / hcf;
			System.out.println(a * b);
		}
		s.close();
	}
}
