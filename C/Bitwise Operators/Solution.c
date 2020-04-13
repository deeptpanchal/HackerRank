#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

void calculate_the_maximum(int n, int k) 
{
	int and=0;
	int or=0;
	int xor=0;
	for(int i =1;i<=n;i++)
	{
		for(int j=i+1;j<=n;j++)
		{
			int a = i&j;
			int o = i|j;
			int x = i^j;
			if(and<a && a<k)
			{
				and = a;
			}
			if(or<o && o<k)
			{
				or = o;
			}
			if(xor<x && x<k) 
			{
				xor = x;
			}
		} 
	}
	printf("%d\n%d\n%d", and, or, xor);
}

int main() 
{
    	int n, k;
    	scanf("%d %d", &n, &k);
    	calculate_the_maximum(n, k);
    	return 0;
}
