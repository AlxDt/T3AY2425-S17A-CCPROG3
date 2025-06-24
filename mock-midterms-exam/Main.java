import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display all accounts");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.nextLine();

                    System.out.print("Enter holder name: ");
                    String name = scanner.nextLine();

                    // TODO: [M1] Add a bank account with the necessary details to the bank



                    // END M1

                    System.out.println("Account created successfully.");

                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();

                    // TODO: [M2] Find the account using the given account number.



                    // END M2

                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();

                        if (/* TODO: [M2] Using the account, deposit to it the given amount. */) {
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Invalid amount.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();

                    // TODO: [M3] Find the account using the given account number.



                    // END M3

                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();

                        if (/* TODO: [M3] Using the account, withdraw from it the given amount. */) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Invalid amount or insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;
                case 4:
                    // TODO: [M4] Display all accounts of the bank.



                    // END M4

                    break;
                case 5:
                    running = false;

                    System.out.println("Thank you for using the bank system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}

