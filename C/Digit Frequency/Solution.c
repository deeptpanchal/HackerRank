#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    	char s[1000];
    	scanf("%s",s);
    	int a0=0;
    	int a1=0;
    	int a2=0;
    	int a3=0;
    	int a4=0;
    	int a5=0;
    	int a6=0;
    	int a7=0;
    	int a8=0;
    	int a9=0;
    	for(int i =0;i<strlen(s);i++)
    	{
        	if(s[i]-'0'==0)
        	{
            		a0++;
        	}
        	if(s[i]-'1'==0)
        	{
            		a1++;
        	}
        	if(s[i]-'2'==0)
        	{
            		a2++;
        	}
        	if(s[i]-'3'==0)
        	{
            		a3++;
        	}
        	if(s[i]-'4'==0)
        	{
            		a4++;
        	}
        	if(s[i]-'5'==0)
        	{
            		a5++;
        	}
        	if(s[i]-'6'==0)
        	{
            		a6++;
        	}
        	if(s[i]-'7'==0)
        	{
            		a7++;
        	}
        	if(s[i]-'8'==0)
        	{
            		a8++;
        	}
        	if(s[i]-'9'==0) 
        	{
            		a9++;
        	}
    	}
    	printf("%d %d %d %d %d %d %d %d %d %d",a0,a1,a2,a3,a4,a5,a6,a7,a8,a9);
    	return 0;
}
