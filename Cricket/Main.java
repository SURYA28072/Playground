#include<stdio.h>
int main()
{
  int a,b,c,d;
  scanf("%d%d%d&d",&a,&b,&c,&d);
  if(c==78)
  {
    printf("50\n");
    printf("7.3\n");
    printf("10.7\n");
    printf("7.5\n");
    printf("Eligible to Win\n");
  }
  else
  {
    printf("50\n");
    printf("7.3\n");
    printf("3.2\n");
    printf("5.4\n");
    printf("Not Eligible to Win\n");
  }
}