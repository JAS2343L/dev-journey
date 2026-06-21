#include <stdio.h>


int main() {
    int burger;

    printf("ENTER NumbEr: ");
    scanf("%d", &burger);

    if(burger < 0) {
        printf("NEGATIVE\n");
    }
    else if(burger == 0) {
        printf("ZERO\n");
    } 
    else {
        printf("POSITIVE\n");
    }
    return 0;
}