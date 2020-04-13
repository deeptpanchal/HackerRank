#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
        char c1;
        scanf("%c",&c1);
        char c2[100];
        scanf("%s",c2);
        char t;
        scanf("%c",&t);
        char c3[' '];
        scanf("%[^\n]%*c",c3);
        printf("%c",c1);
        printf("\n");
        printf("%s",c2);
        printf("\n");
        printf("%s",c3);
        return 0;
}
