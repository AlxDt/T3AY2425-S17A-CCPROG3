public class Beverage extends Food {
    private Size size;

    public Beverage(
        String name,
        double price,
        Size size
    ) {
        super(name, price);

        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.size;
    }
}
