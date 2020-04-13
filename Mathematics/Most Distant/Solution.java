import java.util.*;

public class Solution 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int x_max = Integer.MIN_VALUE;
		int x_min = Integer.MAX_VALUE;
		int y_max = Integer.MIN_VALUE;
		int y_min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			x[i] = s.nextInt();
			y[i] = s.nextInt();
			if (x[i] == 0) 
			{
				y_max = Math.max(y_max, y[i]);
				y_min = Math.min(y_min, y[i]);
			}
			if (y[i] == 0) 
			{
				x_max = Math.max(x_max, x[i]);
				x_min = Math.min(x_min, x[i]);
			}
		}
		double d_x = Math.abs(x_max - x_min);
		double d_y = Math.abs(y_max - y_min);
		double d_xmax = Math.max(Math.abs(x_max), Math.abs(x_min));
		double d_ymax = Math.max(Math.abs(y_max), Math.abs(y_min));
		double d_x_y = Math.sqrt(d_xmax * d_xmax + d_ymax * d_ymax);
		double d_max = Math.max(d_x, Math.max(d_y, d_x_y));
		System.out.printf("%.6f", d_max);
		s.close();
	}
}
