#include <stdio.h>
#include <stdlib.h>

int main(){

    int n1, i, fact = 1;

    printf("Please type an integer number");
    scanf("%d", &n1);

    for(i = 1; i <= n1; i++){
        fact = fact * i;
    }

    printf("Factorial of %d is %d", n1, fact);
}