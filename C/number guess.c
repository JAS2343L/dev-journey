#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    
    int rn;
        srand(time(0));
        rn = (rand()% 100) + 1;

        printf("here %d", rn);

    return 0;
    
}