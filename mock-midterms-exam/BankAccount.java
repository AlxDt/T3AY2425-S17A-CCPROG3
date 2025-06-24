import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private ArrayList<Transaction> transactions;

    // TODO: [A1] Write the constructor of this class
    // The constructor should:
    // - Assign the account number
    // - Assign the holder name
    // - Set the balance to 0
    // - Initialize the empty transactions



    // END A1

    // TODO: [A2] Deposit an amount to the account,
    // then ONLY IF the amount is valid, add a transaction with the following data to the list of transactions:
    // - Type: "Deposit"
    // - Value: <whatever is the given amount>

    // Return true if the deposit is a valid amount (> 0)
    // Return false if it isn't
    public boolean deposit(double amount) {
    }

    // TODO: [A3] Withdraw an amount from the account,
    // then ONLY IF the amount is valid, add a transaction with the following data to the list of transactions:
    // - Type: "Withdraw"
    // - Value: <whatever is the given amount>

    // Return true if the withdrawal is a valid amount (> 0) AND amount to withdraw does not exceed the balance
    public boolean withdraw(double amount) {
    }

    public void displayTransactions() {
        System.out.println("Transaction history for account " + accountNumber);

        // TODO: [A4] Display all transactions in this account

        

        // END A4
    }

    public void displayAccountInfo() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}
