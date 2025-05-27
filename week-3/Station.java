public class Station {
    // Fields (variables)
    private String name;
    private Train train;

    // Constructor
    // If you did not write the constructor yourself,
    // there is an implicit default one being used
    // The default constructor looks like:
    // public Station() {
    // }
    // The default constructor is also called the empty constructor
    public Station(
        String name,
        Train train) {
            this.name = name;
            this.train = train;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public Train getTrain() {
        return this.train;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    // Methods
    public void open() {
        // TODO: Change this method such that it displays the name of the station being opened
        System.out.println("This station is now open");
    }
    
    public void close() {
        // TODO: Change this method such that it displays the name of the station being closed
        System.out.println("This station is now closed");
    }
}