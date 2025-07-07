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
