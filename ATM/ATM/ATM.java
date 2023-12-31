import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                if (bankAccount.withdraw(withdrawAmount)) {
                    System.out.println("Withdrawal successful. Remaining balance: $" + bankAccount.getBalance());
                }
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                System.out.println("Deposit successful. Updated balance: $" + bankAccount.getBalance());
                break;

            case 3:
                System.out.println("Current balance: $" + bankAccount.getBalance());
                break;

            case 4:
                System.out.println("Exiting the ATM. Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial account balance: $");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                atm.performTransaction(choice, scanner);
            } else {
                System.out.println("Invalid choice. Please choose a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
