public class Program {
    public static void main(String[] args) {
        // For now, let's create a train
        //<data_type> <identifier> = <value>;

        // Train() -> constructor
        // The constructor instantiates the object
        // Assign values to the object
        Train lrt1Train
            = new Train("LRTA 13000 Class", 1388, 60.0, 48);

        // Get the values from the object
        System.out.println("The properties of the train:");
        System.out.println("The train model: " + lrt1Train.getModel());
        System.out.println("The number of passengers: " + lrt1Train.getNumberOfPassengers());
        System.out.println("The passenger capacity: " + lrt1Train.getPassengerCapacity());
        System.out.println("The current speed: " + lrt1Train.getSpeed());
        System.out.println("The maximum speed: " + lrt1Train.getMaximumSpeed());
        System.out.println("The number of wheels: " + lrt1Train.getNumberOfWheels());

        System.out.println();

        Station vitoCruz
            = new Station("Vito Cruz", null);

        System.out.println("The properties of the station:");

        System.out.println("The station name: " + vitoCruz.getName());
        System.out.println("The train inside the station is " + vitoCruz.getTrain());

        System.out.println();

        Station gilPuyat
            = new Station("Gil Puyat", null);

        System.out.println("The properties of the station:");

        System.out.println("The station name: " + gilPuyat.getName());
        System.out.println("The train inside the station is " + gilPuyat.getTrain());

        System.out.println();

        System.out.println("[START SIMULATION]");

        // Open the stations
        vitoCruz.open();
        gilPuyat.open();

        lrt1Train.move();
        lrt1Train.stop();

        // Put a train inside the station
        // The train is now in the Vito Cruz station
        vitoCruz.setTrain(lrt1Train);
        System.out.println("There is a " + lrt1Train.getModel() + " train inside the " + vitoCruz.getName() + " station.");

        // Open the doors to let passengers in
        lrt1Train.openDoors();
        lrt1Train.setNumberOfPassengers(7);
        System.out.println("The number of passengers in the train after the doors have opened are " + lrt1Train.getNumberOfPassengers());
        lrt1Train.closeDoors();

        lrt1Train.move();
        // Remove the train from the station
        vitoCruz.setTrain(null);
        lrt1Train.stop();

        // Put a train inside the station
        // The train is now in the Gil Puyat station
        gilPuyat.setTrain(lrt1Train);
        System.out.println("There is a " + lrt1Train.getModel() + " train inside the " + gilPuyat.getName() + " station.");

        lrt1Train.openDoors();
        lrt1Train.setNumberOfPassengers(25);
        System.out.println("The number of passengers in the train after the doors have opened are " + lrt1Train.getNumberOfPassengers());
        lrt1Train.closeDoors();

        // Remove the train from the station
        lrt1Train.move();
        gilPuyat.setTrain(null);

        // Close the stations
        vitoCruz.close();
        gilPuyat.close();
    } 
}