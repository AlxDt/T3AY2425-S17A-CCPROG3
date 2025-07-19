public class PriorityPassenger extends Passenger {
    private boolean isInPriority;

    public PriorityPassenger(Station destination) {
        super(destination);

        this.isInPriority = false;
    }

    @Override
    // Problem: We assumed that all priority passengers are in the priority section
    public void alight(Train train) {
        // Check if this passenger is in the priority section or not
        if (train.getPriorityPassengers().contains(this)) {
            train.getPriorityPassengers().remove(this);
        } else {
            train.getRegularPassengers().remove(this);
        }
    }

    @Override
    public boolean tryBoard(Train train, int load) {
        // Check if kasya in the priority section
        if (load + 1 <= train.getTotalCapacity()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void board(Train train) {
        // Leave the station
        this.leaveStation(train);

        // Ride the train
        if (train.getPriorityPassengers().size() < train.getPriorityCapacity()) {
            train.getPriorityPassengers().add(this);
            
            this.isInPriority = true;
        } else {
            train.getRegularPassengers().add(this);

            this.isInPriority = false;
        }
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase();
    }
}
