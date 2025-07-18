import java.util.ArrayList;

public class Train {
    private final int CAPACITY; 
    private ArrayList<Passenger> passengers;
    private Station currentStation;

    public Train(int capacity) {
        this.CAPACITY = capacity;
        this.passengers = new ArrayList<>();
        this.currentStation = null;
    }

    public int getCapacity() {
        return this.CAPACITY;
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

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    @Override
    public String toString() {
        String loadFactor = this.passengers.size() + "/" + this.CAPACITY;

        return String.format("%-9s", loadFactor) + ">";
    }
}
