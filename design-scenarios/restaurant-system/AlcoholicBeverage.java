public class AlcoholicBeverage extends Beverage {

    public AlcoholicBeverage(
        String name,
        double price,
        Size size
    ) {
        super(name, price, size);
    }

    @Override
    public String toString() {
        return super.toString() + " [>= 18 only!]";
    }
}
