#include <stdio.h>
#include <stdlib.h>

void game(int guess, int secretNumber){

     while(guess != secretNumber){
        printf("Oh no! That's not the correct value, try again.\n");
        scanf("%d", &guess);
    }
    printf("Wow! Congratulations, that's the hidden number\n");
}

int main(){

    int secretNumber = 68;
    int guess;

    printf("Try to guess the hidden number. Type an integer value:\n");
    scanf("%d", &guess);
    game(guess, secretNumber);
    return 0;
}

