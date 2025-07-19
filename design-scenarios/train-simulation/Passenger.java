public class Passenger {
    private Station destination;

    public Passenger(Station destination) {
        this.destination = destination;
    }

    public Station getDestination() {
        return this.destination;
    }

    public boolean tryBoard(Train train, int load) {
        if (load + 1 <= train.getRegularCapacity()) {
            return true;
        } else {
            return false;
        }
    }

    public void board(Train train) {
        // Leave the station
        this.leaveStation(train);

        // Ride the train
        train.getRegularPassengers().add(this);
    }

    public boolean tryAlight(Train train) { 
        Station currentDestination = train.getCurrentStation();
        if (destination == currentDestination) { 
            return true;
        } else {
            return false; 
        }
    }

    public void alight(Train train) {
        train.getRegularPassengers().remove(this);
    }

    protected void leaveStation(Train train) {
        train.getCurrentStation().getPassengers().remove(this);
    }
        
    @Override
    public String toString() {
        switch (this.destination.getName()) {
            case "Manila":
                return "a";
            case "Ortigas":
                return "b";
            case "BGC":
                return "c";
            case "Makati":
                return "d";
            default:
                return "";
        }
    }
}
