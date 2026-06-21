#include <stdio.h>

int main() {
    int age;
    printf("What Is Your Age? : ");
    scanf("%d", &age);

    if (age >= 18) {
        printf("You are an adult");
    } else {
        printf("You are an chotu child!!");
    }
    return 0;

}