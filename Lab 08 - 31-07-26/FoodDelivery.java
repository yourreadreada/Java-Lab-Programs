// Assignment 6 - Exercise 2: Food Delivery using Inner and Anonymous Classes
import java.util.*;
class StatusTracker // Base class for anonymous class
{
    void updateStatus() // Method to be overridden
    {
        System.out.println("Status: Pending..."); // Default status
    }
}
public class FoodDelivery
{
    class OrderDetails // Inner class
    {
        String item; // Inner class variable for food item
        double price; // Inner class variable for price
        
        void display() // Method to display order
        {
            System.out.println("\nOrder Confirmation: " + item + " | Total: Rs. " + price);
        }
    }
    
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        FoodDelivery app = new FoodDelivery(); // Outer class instance
        FoodDelivery.OrderDetails order = app.new OrderDetails(); // Inner class instance
        
        System.out.print("Enter Food Item: ");
        order.item = sc.nextLine(); // Assigning item directly to inner class variable
        System.out.print("Enter Price: ");
        order.price = sc.nextDouble(); // Assigning price directly to inner class variable
        
        order.display(); // Showing order details
        
        StatusTracker status = new StatusTracker() // Creating anonymous class for tracking
        {
            void updateStatus() // Overriding tracker method
            {
                System.out.println("Status Update: Food is prepared and out for delivery!");
            }
        };
        status.updateStatus(); // Executing anonymous class method
        sc.close();
    }
}