public class NonAlcoholicBeverage extends Beverage implements Discountable {
    
    public NonAlcoholicBeverage(
        String name,
        double price,
        Size size
    ) {
        super(name, price, size);
    }

    @Override
    public void setDiscount(double discount) {
        this.setPrice(this.getPrice() * discount);
    }
}
