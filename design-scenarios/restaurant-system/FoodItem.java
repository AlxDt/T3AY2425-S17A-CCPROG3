public class FoodItem {
    private Food food;
    private int stock; 

    public FoodItem(
        Food food,
        int stock
    ) {
        this.food = food;
        this.stock = stock;
    }

    public Food getFood() {
        return this.food;
    }

    public int getStock() {
        return this.stock;
    }

    @Override
    public String toString() {
        return this.food + " - (x" + this.stock + ")";
    }
}
