import java.util.ArrayList;

public class Station {
    private String name;
    private Train train;
    private ArrayList<Passenger> passengers;

    public Station(
        String name,
        Train train,
        ArrayList<Passenger> passengers
    ) {
        this.name = name;
        this.train = train;
        this.passengers = passengers;
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
