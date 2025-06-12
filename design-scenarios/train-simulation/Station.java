import java.util.ArrayList;

public class Station {
    private String name;
    private Train train;
    private ArrayList<Passenger> passengers;
    private Station nextStation;

    // 1st constructor
    // You need:
    // - name
    // - train
    public Station(
        String name,
        Train train
    ) {
        this.name = name;
        this.train = train;
        this.passengers = new ArrayList<>();
        this.nextStation = null;

        // How do I assign the current station to the train
        // this.train can be null!!!
        // We need to guard setCurrentStation() against the scenario when this.train is null
        if (this.train != null) {
            // We can only set the current station of the train when the train exists
            this.train.setCurrentStation(this);
        }
    }

    // 2nd constructor
    // You need
    // - name
    // (but no train)
    public Station(String name) {
        // Calls the 1st constructor
        this(
            name,
            null
        );
    }

    public String getName() {
        return this.name;
    }

    public Train getTrain() {
        return this.train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getNextStation() {
        return this.nextStation;
    }

    public void setNextStation(Station nextStation) {
        this.nextStation = nextStation;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        // Return the String representation of this object
        String displayString = "";

        // Display the indicator for whether the train is in the station
        if (this.train != null) {
            displayString += "> ";
        } else {
            displayString += "  ";
        }

        // Display the name of the station
        displayString += String.format("%-20s", this.name);

        // Display the passengers of the station
        for (Passenger passenger : this.passengers) {
            displayString += passenger;
        }

        return displayString;
    }
}
