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
            System.out.println("5. Display all transactions");
            System.out.println("6. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            BankAccount acc;

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.nextLine();

                    System.out.print("Enter holder name: ");
                    String name = scanner.nextLine();

                    // TODO: [M1] Add a bank account with the necessary details to the bank,
                    // but only if the account number doesn't already exist yet

                    if () {


                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Account number already exists.");
                    }

                    // END M1

                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();

                    // TODO: [M2] Find the account using the given account number.



                    // END M2

                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();

                        if (/* TODO: [M3] Using the account, deposit to it the given amount. */) {
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

                    // TODO: [M4] Find the account using the given account number.



                    // END M4

                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();

                        if (/* TODO: [M5] Using the account, withdraw from it the given amount. */) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Invalid amount or insufficient balance.");
                        }
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;
                case 4:
                    // TODO: [M6] Display all accounts of the bank without using print statements.


                    // END M6

                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextLine();

                    // TODO: [M7] Find the account using the given account number.



                    // END M7

                    if (acc != null) {
                        // TODO: [M8] Display all transactions given the account number.
                        

    
                        // END M8
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;
                case 6:
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

