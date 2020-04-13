#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int n1;
    int m1;
    float n2;
    float m2;
    scanf("%d",&n1);
    scanf("%d",&m1);
    scanf("%f", &n2);
    scanf("%f", &m2);
    printf("%d %d",n1+m1,n1-m1);
    printf("\n");
    printf("%.1f %.1f",n2+m2,n2-m2);
    return 0;
}
