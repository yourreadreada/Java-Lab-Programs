// Assignment 3 - Exercise 2: Restaurant Billing using overloaded methods and static variable
import java.util.*;
public class RestaurantBilling
{
    static int totalorders = 0; // Static variable for tracking orders
    public static void CalBill(double dinebill) // Function To Calculate Bill For Dine-In
    {
        totalorders++; // Incrementing order count
        System.out.println("Dine-In Bill Amount = " + dinebill); // Displaying bill
    }
    public static void CalBill(double takebill, double charges) // Function To Calculate Bill For TakeAway
    {
        totalorders++; // Incrementing order count
        double finalbill = takebill + charges; // Calculating total
        System.out.println("Take-Away Bill Amount = " + finalbill); // Displaying bill
    }
    public static void CalBill(double deliverybill, double charges, double deliverycharge) // Function To Calculate Bill For Delivery
    {
        totalorders++; // Incrementing order count
        double finalbill = deliverybill + charges + deliverycharge; // Calculating total
        System.out.println("Delivery Bill Amount = " + finalbill); // Displaying bill
    }
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Restaurant Billing -");
        System.out.print("Enter Dine-In Amount: ");
        double amt1 = sc.nextDouble();
        CalBill(amt1); // Calling overloaded method for Dine-In
        
        System.out.print("\nEnter Take-Away Amount and Packing Charge: ");
        double amt2 = sc.nextDouble();
        double pack = sc.nextDouble();
        CalBill(amt2, pack); // Calling overloaded method for Take-Away

        System.out.print("\nEnter Delivery Amount, Packing, and Delivery Charge: ");
        double amt3 = sc.nextDouble();
        double pack2 = sc.nextDouble();
        double del = sc.nextDouble();
        CalBill(amt3, pack2, del); // Calling overloaded method for Delivery

        System.out.println("\nTotal Orders Processed: " + totalorders); // Displaying static variable
        sc.close();
    }
}