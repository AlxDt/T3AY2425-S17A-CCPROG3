import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        // Create the train
        Train train = new Train(10);

        // Create the stations
        Station[] stations = assembleStations(train); 

        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;

        do {
            // Process user response
            boolean proceed = false;

            do
            {
                // Clear the screen
                clearScreen();

                // Display the title
                System.out.println("[TRAIN SIMULATION]");
                System.out.println();

                // Display the stations
                displayStations(stations);

                // Display menu of actions
                System.out.println();
                System.out.println("What do you want to do?");
                System.out.println();
                System.out.println("[1] Add passengers in Manila");
                System.out.println("[2] Add passengers in Ortigas");
                System.out.println("[3] Add passengers in BGC");
                System.out.println("[4] Add passengers in Makati");
                System.out.println("[X] End simulation");
                System.out.println();
                System.out.print("Or enter a blank line to proceed to the next tick: ");

                // Process user input
                String response = scanner.nextLine();

                switch (response.toUpperCase()) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                        int originStationNumber = Integer.parseInt(response);
                        Station originStation = stations[originStationNumber - 1];

                        // Add a passenger at the station chosen by the user
                        addPassenger(
                            scanner,
                            originStation,
                            stations);

                        break;
                    case "X":
                        isDone = true;
                        break;
                    case "":
                        proceed = true;
                        break;
                    // If invalid input, just display the menu again without proceeding
                }
            } while (!proceed && !isDone);

            // Make the train move
            if (!isDone) {
                train.move();
            }
        }
        while (!isDone);

        // Don't forget to close the scanner
        scanner.close();
    } 

    // Create and link the stations, adding the train to where it's supposed to be
    private static Station[] assembleStations(Train train) {
        // Create the stations
        Station manila = new Station("Manila", train); // The train should be in Manila at the start
        Station ortigas = new Station("Ortigas");
        Station bgc = new Station("BGC");
        Station makati = new Station("Makati");

        // Link the stations with each other
        manila.setNextStation(ortigas);
        ortigas.setNextStation(bgc);
        bgc.setNextStation(makati);
        makati.setNextStation(manila);
        
        // TODO: #3 [2 pts]
        // Save the assembled stations above to an array. Make sure to save them in order.
        // For instance:
        // stations[0] should be Manila,
        // stations[1] should be Ortigas, etc.
        Station[] stations = 
        {
            manila,
            ortigas,
            bgc,
            makati
        };
        // END #3

        return stations;
    }

    // TODO: #4 [3 pts]
    // Implement the method body to print each station in the given stations array.
    // Make sure that the toString() of Station is used - don't implement your displaying
    // logic in here.
    private static void displayStations(Station[] stations) {
        for (Station station : stations) {
            System.out.println(station);
        }
    }
    // END #4

    // Clears the screen on terminals which support ANSI escape codes.
    // This may work on your terminal but probably not on the terminal of your IDE.
    // No need to understand the details of this code, just know that it clears the screen (abstraction!).
    private static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static void addPassenger(
        Scanner scanner,
        Station originStation,
        Station[] stations
    ) {
        // Display the menu for choosing the destination of the passenger to add
        System.out.println();
        System.out.println("Adding passenger to " + originStation.getName() + "... where is the passenger going?");
        System.out.println();

        System.out.println("[1] Manila");
        System.out.println("[2] Ortigas");
        System.out.println("[3] BGC");
        System.out.println("[4] Makati");
        System.out.println();

        // Process the input
        String destination = scanner.nextLine();
        Station destinationStation = null;

        switch (destination) {
            case "1":
            case "2":
            case "3":
            case "4":
                int destinationNumber = Integer.parseInt(destination);
                destinationStation = stations[destinationNumber - 1];

                break;
            // If invalid input, just cancel the adding of the passenger
        }

        // Make sure that there was a destination station set
        if (destinationStation != null) {
            if (/* TODO: #5 [2 pts] - Check if the origin and destination stations are the same - fill out this condition so that this scenario will not be allowed!*/
                    originStation.getName().equals(destinationStation.getName())) {
                System.out.println("The origin and destination may not be the same.");
                System.out.println("Press Enter to continue...");

                scanner.nextLine();
            } else {
                // TODO: #6 [3 pts]
                // Create a new passenger object with the given destination station above.
                // Afterwards, add that passenger to the list of passengers in the origin station.

                Passenger passenger = new Passenger(destinationStation);
                originStation.getPassengers().add(passenger);

                // END #6
            }
        }
    }
}
