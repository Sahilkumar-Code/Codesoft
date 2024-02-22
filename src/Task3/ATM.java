package Task3;

import java.util.Scanner;

public class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: rs");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: rs");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: rs" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(0.0); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.Menu();
    }
}

