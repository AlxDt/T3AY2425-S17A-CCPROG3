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
        
        // Link the stations with each other
        manila.setNextStation(ortigas);
        ortigas.setNextStation(bgc);
        bgc.setNextStation(makati);
        makati.setNextStation(manila);

        // Display all stations
        // When you print an object, it internally uses the toString() method of that object
        System.out.println(manila);
        System.out.println(ortigas);
        System.out.println(bgc);
        System.out.println(makati);
    } 
}
