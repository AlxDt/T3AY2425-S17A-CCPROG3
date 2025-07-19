import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Assemble the objects
        // NOTE: If you have your own class that you think does the same thing as FoodItem, you can replace FoodItem with that class of yours
        ArrayList<FoodItem> foodItems = initializeStock();

        // Display the menu
        displayMenu(foodItems);
    }

    // TODO #1: [10 points] Create the initializeStock() method
    // In this method, you should load THREE non-beverage items and TWO beverages (up to your creativity what they are) into
    // an ArrayList of the required type. That ArrayList will be the value to return.
    // 
    // HINT 1: What is the required type? Look at where the return value of initializeStock() is stored.











    // END #1

    // TODO #2: [20 points] Create the displayMenu() method
    // In this method, you should display the menu using the given ArrayList of the food items.
    // Do NOT implement the logic for the String formatting in this method; delegate that logic to the toString() methods of the respective classes.
    // 
    // Please take note of the required format for displaying each food item:
    // If it's a non-beverage: <name> - P<price> (x<stock>)
    // If it's a beverage: <name> - P<price> - <size> (x<stock>) 
    // 
    // Example:
    // 
    // ------ MENU ------
    // Pizza - P200.0 (x2)
    // Hotdog - P94.0 (x0)
    // Soda - P40.0 - Big (x3)
    //
    // HINT 1: You need to implement the toString() method of the FoodItem class (or your equivalent of that class).
    //         Within that method, you will need to use the toString() methods of the other classes as well (e.g., Food).
    //         Now, would you need to rewrite parts of the same displaying logic all over again? 
    //         Do not hestitate to inherit as much logic as you can to prevent repitition.









    // END #2
}