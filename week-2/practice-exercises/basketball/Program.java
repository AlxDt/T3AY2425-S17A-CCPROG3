import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // The scanner object is your input-getter (hence, scanner)
        Scanner scanner = new Scanner(System.in);

        // Regulation period (quarters 1 through 4)
        int dlsuTotalPoints = 0;
        int admuTotalPoints = 0;

        for (int quarter = 1; quarter <= 4; quarter++) {
            int dlsuPointsForQuarter;
            int admuPointsForQuarter;

            System.out.println("[QUARTER " + quarter + "]");

            System.out.print("DLSU points in Q" + quarter + ": ");

            dlsuPointsForQuarter = scanner.nextInt();
            dlsuTotalPoints += dlsuPointsForQuarter;
            
            System.out.print("ADMU points in Q" + quarter + ": ");

            admuPointsForQuarter = scanner.nextInt();
            admuTotalPoints += admuPointsForQuarter;

            System.out.println();

            System.out.println("DLSU points after Q" + quarter + ": " + dlsuTotalPoints);
            System.out.println("ADMU points after Q" + quarter + ": " + admuTotalPoints);

            System.out.println();
        }

        // Check for winning condition after regulation period,
        // then decide the winner (if any)
        String winner = "none";

        if (dlsuTotalPoints > admuTotalPoints) {
            winner = "DLSU";
        } else if (admuTotalPoints > dlsuTotalPoints) {
            winner = "ADMU";
        } else {
            System.out.println("Tied game, overtime!");

            System.out.println();
            
            int overtimePeriod = 1;

            do {
                int dlsuPointsForOvertimePeriod;
                int admuPointsForOvertimePeriod;

                System.out.println("[OVERTIME " + overtimePeriod + "]");

                System.out.print("DLSU points in OT" + overtimePeriod + ": ");

                dlsuPointsForOvertimePeriod = scanner.nextInt();
                dlsuTotalPoints += dlsuPointsForOvertimePeriod;
                
                System.out.print("ADMU points in OT" + overtimePeriod + ": ");

                admuPointsForOvertimePeriod = scanner.nextInt();
                admuTotalPoints += admuPointsForOvertimePeriod;

                System.out.println();

                System.out.println("DLSU points after OT" + overtimePeriod + ": " + dlsuTotalPoints);
                System.out.println("ADMU points after OT" + overtimePeriod + ": " + admuTotalPoints);

                System.out.println();

                // Check for winning condition after the overtime period
                // then decide the winner (if any)
                if (dlsuTotalPoints > admuTotalPoints) {
                    winner = "DLSU";
                } else if (admuTotalPoints > dlsuTotalPoints) {
                    winner = "ADMU";
                } else {
                    System.out.println("Tied game, another overtime!");
                    
                    System.out.println();
                }

                overtimePeriod++;
            // Check if the contents of the winner String is not "none", meaning a winner has been decided
            } while (winner.equals("none"));
        }

        // One of the cool features of Java: you can use Strings in a switch!
        switch (winner) {
            case "DLSU":
                System.out.println("DLSU WINS YAY ANIMO");
                break;
            case "ADMU":
                System.out.println("ADMU wins sad");
                break;
        }

        scanner.close();
    }
}