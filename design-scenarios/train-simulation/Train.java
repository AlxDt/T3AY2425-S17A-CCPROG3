import java.util.ArrayList;

public class Train {
    private final int REGULAR_CAPACITY; 
    private final int PRIORITY_CAPACITY;

    private ArrayList<Passenger> passengers;
    private ArrayList<PriorityPassenger> priorityPassengers;

    private Station currentStation;

    public Train(int capacity, int priorityCapacity) {
        this.REGULAR_CAPACITY = capacity;
        this.PRIORITY_CAPACITY = priorityCapacity;

        this.passengers = new ArrayList<>();
        this.priorityPassengers = new ArrayList<>();

        this.currentStation = null;
    }

    public int getRegularCapacity() {
        return this.REGULAR_CAPACITY;
    } 

    public int getPriorityCapacity() {
        return this.PRIORITY_CAPACITY;
    }

    public int getTotalCapacity() {
        return this.REGULAR_CAPACITY + this.PRIORITY_CAPACITY;
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

    public ArrayList<Passenger> getRegularPassengers() {
        return this.passengers;
    }

    public ArrayList<PriorityPassenger> getPriorityPassengers() {
        return this.priorityPassengers;
    }

    public ArrayList<Passenger> getAllPassengers() {
        ArrayList<Passenger> allPassengers = new ArrayList<>();

        allPassengers.addAll(this.passengers);
        allPassengers.addAll(this.priorityPassengers);

        return allPassengers;
    }

    public int getTotalLoad() {
        return this.passengers.size() + this.priorityPassengers.size();
    }

    @Override
    public String toString() {
        String loadFactor = "[R:" + this.passengers.size() + "/" + this.REGULAR_CAPACITY + " P:" + this.priorityPassengers.size() + "/" + this.PRIORITY_CAPACITY + "]";

        return String.format("%-20s", loadFactor) + ">";
    }
}
