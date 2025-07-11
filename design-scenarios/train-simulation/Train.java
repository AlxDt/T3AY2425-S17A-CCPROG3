import java.util.ArrayList;

public class Train {
    private int capacity; 
    private ArrayList<Passenger> passengers;
    private Station currentStation;

    public Train(int capacity) {
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
        this.currentStation = null;
    }

    public Station getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public void move() {
        this.currentStation = currentStation.getNextStation();
    }
    
    public void arrive() {
        this.currentStation.setTrain(this);
    }
    
    public void depart() {
        this.currentStation.setTrain(null);
    }
}
