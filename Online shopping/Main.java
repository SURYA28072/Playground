#include<stdio.h>
int main()
{
  int fa,fd,fs,aa,ad,as,sa,sd,ss;
  scanf("%d%d%d%d%d%d%d%d%d",&fa,&fd,&fs,&aa,&ad,&as,&sa,&sd,&ss);
  int famt=(fa*(100-fd)/100)+fs;
  int aamt=(aa*(100-ad)/100)+as;
  int samt=(sa*(100-sd)/100)+ss;
  printf("In Flipkart: Rs.%d \n",famt);
  printf("In Snapdeal: Rs.%d \n",aamt);
  printf("In Amazon: Rs.%d  \n",samt);
  if(famt>aamt&&famt>samt)
    printf("He will prefer Flipkart\n");
  else
    if(aamt>samt)
    printf("He will prefer Amazon\n");
    else
           printf("He will prefer Snapdeal\n");
  return 0;
}