#include <stdio.h>
#include <string.h>

int main() {

    char a[100];
    printf("Enter Your Name: ");
    scanf("%s", a);

    char abc[100];
    if (strcmp(a, "simar") == 0) {
        printf("MOTU MOTU %s is CHOTU HEHE HAHA 😛😛\n", a);
    } else {
        printf("Hello %s\n", a);
    }

    return 0;
}