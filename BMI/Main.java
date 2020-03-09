#include<stdio.h>
int main()
{
  float i,j;
  scanf("%f%f",&i,&j);
  if(j/i>=2.5)
    printf("You are underweight. Have an apple daily.\n");
  else if(j/i<2.5&&j/i>2)
    printf("You are normal. Go walking daily and maintain it.\n");
  else
    printf("You are obese. Go to doctor\n");
  //fill your code
}