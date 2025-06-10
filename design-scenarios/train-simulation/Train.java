import java.util.ArrayList;

public class Train {
    private int capacity; 
    private ArrayList<Passenger> passengers;
    private Station currentStation;

    public Train(int capacity) {
        this.capacity = capacity;
        // This is how you create a passenger array list
        this.passengers = new ArrayList<>();
        this.currentStation = null;
    }

    public Station getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public void arrive(Station station) {
        // TODO
    }

    public void depart() {
        // TODO
    }
}
