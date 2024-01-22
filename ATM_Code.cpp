#include<stdio.h>
int main() {
    printf("Welcome to IES Bank\n");
    int ch, amount, aval, pin = 1425, bal = 10000;
    char rept;
    do {
        printf("1. Balance\n2. Change PIN\n3. Withdraw\n4. Statement\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);
        switch(ch) {
            case 1:
                printf("Your current balance is: %d\n", bal);
                break;
            case 2:
                {
                    int newPin;
                    printf("Enter your current pin: %d\n", pin);
                    printf("Enter a new pin: ");
                    scanf("%d", &newPin);
                    pin = newPin;
                    printf("PIN changed successfully\n");
                    break;
                }
            case 3:
                printf("Enter the amount to withdraw: ");
                scanf("%d", &amount);
                if (amount <= bal) {
                    bal -= amount;
                    printf("Withdrawal successful.\nYour available balance is: %d\n", bal);
                } else {
                    printf("Insufficient funds\n");
                }
                break;
            case 4:
                printf("Your available balance is: %d\n", bal);
                break;
            default:
                printf("Enter a valid choice!!!\n");
        }
        printf("Do you want to check again? (y/n): ");
        scanf(" %c", &rept);
    } while (rept == 'y' || rept == 'Y');
    printf("Thanks for using the Code\n");
    return 0;
}
