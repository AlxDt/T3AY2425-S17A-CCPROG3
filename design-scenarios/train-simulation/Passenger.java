public class Passenger {
    private Station destination;

    public Passenger(Station destination) {
        this.destination = destination;
    }

    public Station getDestination() {
        return this.destination;
    }

    public void board(Train train) {
    }

    public void alight(Train train) {
    }

    // TODO: #2 [10 pts]
    // Implement the toString() method of Passenger.
    // The string representation of the passenger is as follows:
    // If the Passenger's destination is Manila, toString() should return the string "1"
    // If the Passenger's destination is Ortigas, toString() should return the string "2"
    // If the Passenger's destination is BGC, toString() should return the string "3"
    // If the Passenger's destination is Makati, toString() should return the string "4"

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

    // END #2
}
