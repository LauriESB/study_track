#include <stdio.h>
#include <stdlib.h>

int main(){

    double n1, n2, result;
    char op;

    printf("Type a number:\n");
    scanf("%lf", &n1);
    printf("Type a second number:\n");
    scanf("%lf", &n2);

    printf("Choose an option\n");
    printf(" a - Addition\n");
    printf(" s - Subtraction\n");
    printf(" m - Multiplication\n");
    printf(" d - Division\n");
    scanf (" %c", &op);
    
    switch (op){
        case 'a':
            result = n1 + n2;
        break;

        case 's':
            result = n1 - n2;
        break;

        case 'm':
            result = n1 * n2;
        break;

        case 'd':
            if (n2 == 0){
                printf("Divisão por 0");
            }
            else{
                result = n1 / n2;
            }
        break;

        default:
        printf("Opção inválida. Escolha uma das opções válidas (a, s, m, d).\n");
        return 1; // Saia do programa com um código de erro
    }
    printf("O resultado é %.2f ", result);
    return 0;
}