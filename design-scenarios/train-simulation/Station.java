import java.util.ArrayList;

public class Station {
    private String name;
    private Train train;
    private ArrayList<Passenger> passengers;

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

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
