public abstract class Food {
    private String name; 
    private double price;

    public Food(
        String name,
        double price
    ) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " - P" + this.price;
    }
}

