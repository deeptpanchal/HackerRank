import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int x = s.nextInt();
			if (x == 1 || x == 2) 
			{
				System.out.println("-1");
			} 
			else if (x % 2 == 1) 
			{
				System.out.println("2");
			} 
			else if (x % 4 == 0) 
			{
				System.out.println("3");
			} 
			else 
			{
				System.out.println("4");
			}
		}
		s.close();
	}
}
