import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double L = s.nextDouble();
		double S1 = s.nextDouble();
		double S2 = s.nextDouble();
		int n = s.nextInt();
		for (int i = 0; i < n; i++) 
		{
			double a = s.nextDouble();
			double ans = (L - Math.sqrt(a)) * Math.sqrt(2);
			double div = Math.abs(S1 - S2);
			ans = ans / div;
			System.out.println(ans);
		}
		s.close();
	}
}
