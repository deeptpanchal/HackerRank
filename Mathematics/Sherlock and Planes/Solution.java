import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int z1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int z2 = s.nextInt();
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int z3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			int z4 = s.nextInt();
			int det = (x4 - x1) * (y2 - y1) * (z3 - z1) + (y4 - y1) * (z2 - z1) * (x3 - x1)
					+ (z4 - z1) * (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1) * (z4 - z1)
					- (y3 - y1) * (z2 - z1) * (x4 - x1) - (z3 - z1) * (x2 - x1) * (y4 - y1);
			if (det == 0) 
			{
				System.out.println("YES");
			}
			else 
			{
				System.out.println("NO");
			}
		}
		s.close();
	}
}
