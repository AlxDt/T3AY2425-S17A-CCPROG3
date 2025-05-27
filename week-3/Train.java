public class Train {
    // Properties (variables)
    private String model;

    private int numberOfPassengers;
    private int passengerCapacity;

    private double speed;
    private double maximumSpeed;

    private int numberOfWheels;

    // Constructor
    // Is a special method used to create the object
    // and assign the values of its properties
    public Train(
        String model,
        int passengerCapacity,
        double maximumSpeed,
        int numberOfWheels
    ) {
        numberOfPassengers = 0;
        speed = 0.0;

        // How do you distinguish the property "model" and the parameter "model"
        // this -> refers to the current object (the object here, aka THIS object)
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.maximumSpeed = maximumSpeed;
        this.numberOfWheels = numberOfWheels;
    }

    // Behavior (methods)
    // Getters
    public String getModel() {
        return this.model;
    }

    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getMaximumSpeed() {
        return this.maximumSpeed;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    // Setter
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    // Methods
    public void move() {
        System.out.println("Choo choo!");

        this.speed = this.maximumSpeed;
    }

    public void stop() {
        System.out.println("The train has stopped moving.");

        this.speed = 0.0;
    }

    public void openDoors() {
        System.out.println("Doors are opened");
    }

    public void closeDoors() {
        System.out.println("Doors are closed");
    }
}