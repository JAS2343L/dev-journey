#include <stdio.h>


int main() {
    int a;

    for (a = 1; a <= 999999; a*=3) {
        printf("%d\n", a);
    }
    return 0;
}