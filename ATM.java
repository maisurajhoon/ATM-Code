import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to IES Bank");
        int bal = 10000, pin = 1234, amount;
        char ch;
        do {
            System.out.print("1. Balance\n2. Change PIN\n3. Withdraw\n4. Statement\n");
            System.out.print("Enter the operation you want to perform: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: %d\n", bal);
                    break;
                case 2: {
                    int newPin;
                    System.out.printf("Enter your current pin: %d\n", pin);
                    System.out.print("Enter a new pin: ");
                    newPin = sc.nextInt();
                    pin = newPin;
                    System.out.println("PIN changed successfully");
                    break;
                }
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    amount = sc.nextInt();
                    if (amount <= bal) {
                        bal -= amount;
                        System.out.printf("Withdrawal successful.\nYour available balance is: %d\n", bal);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;
                case 4:
                    System.out.printf("Your available balance is: %d\n", bal);
                    break;
                default:
                    System.out.println("Enter a valid choice!!!");
            }
            System.out.print("Do you want to check again (Y/N)? ");
            sc.nextLine();
            ch = sc.nextLine().toLowerCase().charAt(0);
        } while (ch == 'y');
        System.out.println("Thanks for using my code");
        sc.close();
    }
}
