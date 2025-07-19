import java.util.LinkedList;
import java.util.Queue;

public class Station extends Object {
    private String name;
    private Train train;
    private Queue<Passenger> passengers;
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
        this.passengers = new LinkedList<>();
        this.nextStation = null;

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

    public Queue<Passenger> getPassengers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        // Return the String representation of this object
        String displayString = "";

        // Display the indicator for whether the train is in the station
        if (this.train != null) {
            // operator overloading
            // in this case, the += operator is overloaded
            // meaning, something other than its original behavior is used
            displayString += train;
        } else {
            displayString += String.format("%-21s", " ");
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
