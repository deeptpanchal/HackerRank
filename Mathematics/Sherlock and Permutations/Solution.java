import java.math.*;
import java.util.*;

public class Solution 
{
	public static BigInteger fact(int n) 
	{
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++)
		{
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int y = 0; y < x; y++) 
		{
			int n = s.nextInt();
			int m = s.nextInt();
			BigInteger mod = BigInteger.valueOf(1000000007);
			BigInteger ans = fact(n + m - 1).divide((fact(n).multiply(fact(m - 1))));
			System.out.println(ans.remainder(mod));
		}
		s.close();
	}
}
