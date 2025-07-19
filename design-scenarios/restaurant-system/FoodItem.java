// NOTE: You have the freedom to replace this class if you have your own equivalent of this. If not, this serves as a good starting point.
// NOTE: Do not forget to incorporate the classes you created in Exercise 8 in your submission (e.g., your beverage class).
// Without them, this class (along with the Driver class) will not compile.
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
