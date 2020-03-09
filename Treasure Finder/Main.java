#include<stdio.h>
int main()
{
  int i,j,k;
  scanf("%d%d%d",&i,&j,&k);
  if((i>j&&i<k)||(i<j&&i>k))
  {
    printf("The treasure is in the box which has number %d.\n",i);
    printf("The code to open the box is 1.\n");
  }
  if((j>i&&j<k)||(j<i&&j>k))
  {
    printf("The treasure is in the box which has number %d.\n",j);
    printf("The code to open the box is 2.\n");
  }
  if((k>i&&k<j)||(k<i&&k>j))
  {
    printf("The treasure is in the box which has number %d.\n",k);
    printf("The code to open the box is 7.\n");
  }
}