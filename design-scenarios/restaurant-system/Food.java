public class Food {
    private String name; 
    private double price;

    public Food(
        String name,
        double price
    ) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " - P" + this.price;
    }
}
