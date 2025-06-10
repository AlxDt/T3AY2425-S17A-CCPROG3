public class Driver {
    public static void main(String[] args) {
        // Step 1: Assemble the objects
        // Create the train
        Train train = new Train(10);

        // Create the stations
        Station manila = new Station("Manila", train);
        Station ortigas = new Station("Ortigas");
        Station bgc = new Station("BGC");
        Station makati = new Station("Makati");
    } 
}
