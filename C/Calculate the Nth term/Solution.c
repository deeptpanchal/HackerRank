#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int find(int n, int a, int b, int c) 
{
  	if(n==1)
  	{
      		return a;
  	}
  	if(n==2)
  	{
      		return b;
  	}
  	if(n==3)
  	{
  	    	return c;
  	}
  	return find(n-1, a, b, c) + find(n-2, a, b, c) + find(n-3, a, b, c);
}

int main() 
{
    int n, a, b, c;  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find(n, a, b, c);
    printf("%d", ans); 
    return 0;
}
