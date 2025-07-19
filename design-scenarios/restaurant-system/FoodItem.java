// NOTE: You have the freedom to replace this class if you have your own equivalent of this. If not, this serves as a good starting point.
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
}
