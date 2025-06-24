import java.time.LocalDateTime;

public class Transaction {
    private String type; // "Deposit", "Withdraw", "Transfer"
    private double amount;
    private LocalDateTime timestamp;

    // TODO: [T1] Write the constructor of this class
    // The constructor should:
    // - Assign the type
    // - Assign the amount
    // - Initialize the timestamp to the following value: LocalDateTime.now() (you don't need to know the details)



    // END T1


    public void display() {
        System.out.println(this.timestamp + " - " + this.type + ": " + this.amount);
    }
}
