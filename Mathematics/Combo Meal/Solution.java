import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println(a + b - c);
		}
		s.close();
	}
}
