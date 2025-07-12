public class Passenger {
    private Station destination;

    public Passenger(Station destination) {
        this.destination = destination;
    }

    public Station getDestination() {
        return this.destination;
    }

    public boolean tryBoard(Train train) {
        if (train.getPassengers().size() + 1 <= train.getCapacity()) {
            return true;
        } else {
            return false;
        }
    }

    public void board(Train train) {//add itself
        train.getCurrentStation().getPassengers().remove(this);
        train.getPassengers().add(this);
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
        train.getPassengers().remove(this);
    }

        
    @Override
    public String toString() {
        switch (this.destination.getName()) {
            case "Manila":
                return "1";
            case "Ortigas":
                return "2";
            case "BGC":
                return "3";
            case "Makati":
                return "4";
            default:
                return "";
        }
    }
}
