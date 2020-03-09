#include<stdio.h>
int main()
{
int num1, num2;
    int sum, sub, mult, mod, div;

  
    scanf("%d%d", &num1, &num2);

    /*
     * Perform all arithmetic operations
     */ 
    sum = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = num1 / num2;
    mod = num1 % num2;

    /*
     * Print result of all arithmetic operations
     */
    printf("%d\n", sum);
    printf("%d\n", sub);
    printf("%d\n", mult);
  printf("%d\n", mod);
  printf("%d\n", div);
    

    return 0; 
}