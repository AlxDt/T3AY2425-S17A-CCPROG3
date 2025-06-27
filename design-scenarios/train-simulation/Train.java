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

    // TODO: #1 [5 points]
    // The existing code in this method sets the current station of the train to the next station.
    // However, this code is not enough, because:
    //   1. The station the train had left should know that there isn't any train in that station anymore
    //   2. The new station the train had arrived to should know that there is now a train in it
    // Your task is to fulfill all of the above scenarios by completing the code below.
    // You are free to add more code around the existing code, but you may not change it, nor can you
    // modify the method itself.
    public void move() {
        this.currentStation.setTrain(null);
        this.currentStation = currentStation.getNextStation();
        this.currentStation.setTrain(this);
    }
    // END #1

    public void arrive(Station station) {
    }

    public void depart() {
    }
}
