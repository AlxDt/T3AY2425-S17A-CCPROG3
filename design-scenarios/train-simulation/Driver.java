import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    private static final int NUMBER_OF_STATIONS = 4;
    private static final Random RANDOMIZER = new Random();

    public static void main(String[] args) {
        // Create the train
        Train train = new Train(3, 2);

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
                System.out.println("Add passengers: (use uppercase to add priority passenger)");
                System.out.println("[a] Add passengers in Manila");
                System.out.println("[b] Add passengers in Ortigas");
                System.out.println("[c] Add passengers in BGC");
                System.out.println("[d] Add passengers in Makati");
                System.out.println();
                System.out.println("[r] Add a passenger randomly");
                System.out.println("[x] End simulation");
                System.out.println();
                System.out.print("Or enter a blank line to proceed to the next tick: ");

                // Process user input
                String response = scanner.nextLine();
                boolean isPriority = false;

                switch (response) {
                    case "A": case "B": case "C": case "D":
                        response = response.toLowerCase();
                        isPriority = true;
                    case "a": case "b": case "c": case "d":
                        int originNumber = response.charAt(0) - 'a';
                        Station originStation = stations[originNumber];

                        // Add a passenger at the station chosen by the user
                        addPassenger(
                            scanner,
                            originStation,
                            stations,
                            isPriority);

                        break;
                    case "r":
                        int randomOriginNumber = Driver.RANDOMIZER.nextInt(Driver.NUMBER_OF_STATIONS) + 1;
                        Station randomOriginStation = stations[randomOriginNumber - 1];

                        // Add a passenger at a random station
                        addPassenger(
                            randomOriginStation,
                            stations);

                        break;
                    case "x":
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
                // For each passengers in the train, have them check if they are
                // ready to alight
                // If they are, then alight
                ArrayList<Passenger> passengersToAlight = new ArrayList<>();

                for (Passenger passenger: train.getAllPassengers()) {
                    if (passenger.tryAlight(train)){
                        passengersToAlight.add(passenger);
                    }  
                }

                for (Passenger passengerToAlight : passengersToAlight) {
                    passengerToAlight.alight(train);
                }

                // For each passenger in the queue (in order), have them check if they are
                // ready to alight
                ArrayList<Passenger> passengersToBoard = new ArrayList<>();

                for (Passenger passenger : train.getCurrentStation().getPassengers()) {
                    if (passenger.tryBoard(train, train.getTotalLoad() + passengersToBoard.size())) {
                        passengersToBoard.add(passenger);
                    }
                }

                for (Passenger passengerToBoard : passengersToBoard) {
                    passengerToBoard.board(train);
                }

                // The train departs from the current station
                train.depart();
                
                // The train moves to the next station
                train.move();
                
                // The train arrives at the current station
                train.arrive();
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
        
        Station[] stations = 
        {
            manila,
            ortigas,
            bgc,
            makati
        };

        return stations;
    }

    private static void displayStations(Station[] stations) {
        for (Station station : stations) {
            System.out.println(station);
        }
    }

    // Clears the screen on terminals which support ANSI escape codes.
    // This may work on your terminal but probably not on the terminal of your IDE.
    // No need to understand the details of this code, just know that it clears the screen (abstraction!).
    private static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static void addPassenger(
        Station originStation,
        Station[] stations
    ) {
        int randomDestinationNumber;
        Station randomDestinationStation;
        
        do {
            randomDestinationNumber = Driver.RANDOMIZER.nextInt(NUMBER_OF_STATIONS) + 1;
            randomDestinationStation = stations[randomDestinationNumber - 1];
        }
        while (originStation.getName().equals(randomDestinationStation.getName()));

        boolean isPriority = Driver.RANDOMIZER.nextBoolean();
        
        Passenger passenger
            = isPriority
                ? new PriorityPassenger(randomDestinationStation)
                : new Passenger(randomDestinationStation);

        originStation.getPassengers().add(passenger);
    }

    private static void addPassenger(
        Scanner scanner,
        Station originStation,
        Station[] stations,
        boolean isPriority
    ) {
        // Display the menu for choosing the destination of the passenger to add
        System.out.println();

        if (isPriority) {
            System.out.println("[PRIORITY]");
        }

        System.out.println("Adding passenger to " + originStation.getName() + "... where is the passenger going?");
        System.out.println();

        System.out.println("[a] Manila");
        System.out.println("[b] Ortigas");
        System.out.println("[c] BGC");
        System.out.println("[d] Makati");
        System.out.println("[R] Randomly choose a destination");
        System.out.println();

        // Process the input
        String response = scanner.nextLine();
        response = response.toUpperCase();

        Station destinationStation = null;

        switch (response) {
            case "A":
            case "B":
            case "C":
            case "D":
                int destinationNumber = response.charAt(0) - 'A';
                destinationStation = stations[destinationNumber];

                break;
            case "R":
                int randomDestinationNumber;
                
                
                do {
                    randomDestinationNumber = Driver.RANDOMIZER.nextInt(NUMBER_OF_STATIONS) + 1;
                    destinationStation = stations[randomDestinationNumber - 1];
                }
                while (originStation.getName().equals(destinationStation.getName()));

                break;
            default:
                // If invalid input, just cancel the adding of the passenger
                System.out.println("Invalid input. Passenger adding canceled.");
                System.out.println("Press Enter to continue...");

                scanner.nextLine();

                break;
        }

        // Make sure that there was a destination station set
        if (destinationStation != null) { 
            if (originStation.getName().equals(destinationStation.getName())) {
                System.out.println("The origin and destination may not be the same.");
                System.out.println("Press Enter to continue...");

                scanner.nextLine();
            } else {
                Passenger passenger
                    = isPriority
                        ? new PriorityPassenger(destinationStation)
                        : new Passenger(destinationStation);

                originStation.getPassengers().add(passenger);
            }
        }
    }
}
