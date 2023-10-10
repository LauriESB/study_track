#include <stdio.h>
#include <stdlib.h>

int main(){

    int n1, i, MT, vet[11];

    printf("Please, type an integer value:\n");
    scanf("%d", &n1);

    for(i = 1; i <= 10; i++){
        MT = n1 * i;
        vet[i] = MT;
    }
    printf("\nMULTIPLICATION TABLE\n");
    for (i = 1; i <= 10; i++){
        printf("%d x %d = %d\n", n1, i, vet[i]);
    }

}