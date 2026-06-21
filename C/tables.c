#include <stdio.h>

int main() {
    int lol;

    printf("Enter number: ");
    scanf("%d", &lol);

    int hehe;
    printf("how many times you want to multiply: ");
    scanf("%d", &hehe);

    for (int a = 1; a <= hehe; a++) {
        printf("%d x %d = %d\n", lol, a, lol * a);
    }

    return 0;
}

