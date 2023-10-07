#include <stdio.h>
#include <stdlib.h>

int main(){

    char adj1[15], adj2[15], adj3[15], adj4[15], noun1[20], noun2[20], noun3[20], pluralnoun1[20];


    printf("Choose your path\n");

    printf("type an adjective\n");
        scanf(" %s", adj1);
    printf("type an adjective\n");
        scanf(" %s", adj2);
    getchar();
    printf("type a noun\n");
        fgets( noun1, 20, stdin);
    printf("type a noun\n");
        fgets( noun2, 20, stdin);
    printf("type an adjective\n");
        scanf(" %s", adj3);
    getchar();
    printf("type a noun\n");
        fgets( noun3, 20, stdin);
    printf("type a plural noun\n");
        fgets( pluralnoun1, 20, stdin);
    printf("type an adjective\n");
        scanf(" %s", adj4);


    printf("\nA PLACE FIT FOR A HEDGEHOG\n");
    printf("\nSonic's abode is a very %s place. At first glance, it seems like a/an %s cave,\n", adj1, adj2);
    printf("but if you look closer, you'll see it's actually a comfortable %s", noun1);
    printf("For one, Sonic has a super-cozy beanbag %s", noun2);
    printf("When he feels like listening to some %s tunes from the 90s, Sonic\n", adj3);
    printf("turns on his old-school %s, pulls out his collection of %s, and jams out.\n", noun3, pluralnoun1);
    printf("In addition to great tunes, Sonic has plenty of %s equipment.\n", adj4);

}