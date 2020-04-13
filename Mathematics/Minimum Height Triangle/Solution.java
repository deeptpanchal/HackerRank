import java.util.*;

public class Solution
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		int a = s.nextInt();
		System.out.println((int) Math.ceil((float) 2 * a / b));
		s.close();
	}
}
