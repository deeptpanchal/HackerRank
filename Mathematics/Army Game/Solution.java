import java.util.*;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int a = s.nextInt();
		a = (a % 2 != 0) ? a + 1 : a;
		b = (b % 2 != 0) ? b + 1 : b;
		System.out.println(a * b / 4);
		s.close();
	}
}
