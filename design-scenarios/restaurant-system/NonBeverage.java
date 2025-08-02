public class NonBeverage extends Food implements Discountable {
    private double calories;

    public NonBeverage(
        String name,
        double price,
        double calories
    ) {
        super(name, price);

        this.calories = calories;
    }

    @Override
    public void setDiscount(double discount) {
        this.setPrice(this.getPrice() * discount);
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.calories + " cal)";
    }
}
