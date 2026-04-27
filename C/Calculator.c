#include <stdio.h>
#include <string.h>

int main() {

    int adsbmudi;
    printf("Select An Operator(+ - * /): ");
    scanf("%c", &adsbmudi);

    int num1;
    printf("Enter Any Number (1): ");
    scanf("%d", &num1);

    int num2;
    printf("Enter Any Number (2): ");
    scanf("%d", &num2);


    switch(adsbmudi) {
        case '+':
        printf("Your Answer Is: %d\n", num1 + num2);
        break;

        case '-':
        printf("Your Answer Is: %d\n", num1 - num2);
        break;

        case '*':
        printf("Your Answer Is: %d\n", num1 * num2);
        break;

        case '/':
        if (num2 == 0){
            printf("ARE YOU TRYING TO DIVIDE %d WITH ZERO!!!\n", num2);
        } else {
            printf("Your Answer Is: %d\n",num1 / num2);
        }
        
        break;

        default:
        printf("INVALID OPERATOR, WHAT IS THIS???\n %c \n", adsbmudi);

    }

    return 0;
}