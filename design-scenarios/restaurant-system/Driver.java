import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Assemble the objects
        ArrayList<FoodItem> foodItems = initializeStock();

        // Display the menu
        displayMenu(foodItems);
    }

    private static ArrayList<FoodItem> initializeStock() {
        ArrayList<FoodItem> items = new ArrayList<>(); 

        // Add food here...

        return items;
    }

    private static void displayMenu(ArrayList<FoodItem> foodItems) {
        System.out.println("------ MENU ------");

        for (FoodItem foodItem: foodItems) {
            System.out.println(foodItem);
        }
    }
}