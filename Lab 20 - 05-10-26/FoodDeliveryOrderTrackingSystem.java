// Extra Assignment - Food Delivery Order Tracking System
import java.util.*;
interface DeliveryStatus // Interface
{
    void updateStatus(String status); // Abstract method
}

class Order
{
    int orderid;
    String customername;
    double amount;
    Order(int id, String custname, double amt) // Parameterized constructor
    {
        orderid = id;
        customername = custname;
        amount = amt;
    }

    class OrderDetails // Inner class
    {
        void display()
        {
            System.out.println("\n-- Order Information --");
            System.out.println("Order ID: " + orderid);
            System.out.println("Customer Name: " + customername);
            System.out.println("Amount: ₹" + amount);
        }
    }
}

public class FoodDeliveryOrderTrackingSystem
{
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consuming newline
        System.out.print("Enter Customer Name: ");
        String custname = sc.nextLine();
        System.out.print("Enter Order Amount: ");
        double amt = sc.nextDouble();

        Order order = new Order(id, custname, amt); // Creating Order object
        Order.OrderDetails details = order.new OrderDetails(); // Creating instance of inner class
        details.display();

        DeliveryStatus statusTracker = new DeliveryStatus() // Anonymous Class implementing Interface
        {
            public void updateStatus(String status) // Overriding method
            {
                if(status.equalsIgnoreCase("ORDER_PLACED"))
                {
                    System.out.println("Status [" + status + "]: Order Placed!");
                }
                else if(status.equalsIgnoreCase("PREPARING")) 
                {
                    System.out.println("Status [" + status + "]: Preparing Your Order!"); 
                }
                else if(status.equalsIgnoreCase("OUT_FOR_DELIVERY")) 
                {
                    System.out.println("Status [" + status + "]: Out For Delivery!"); 
                }
                else if(status.equalsIgnoreCase("DELIVERED"))
                {
                    System.out.println("Status [" + status + "]: Delivered! Enjoy! ");
                }
                else // Unknown condition
                {
                    System.out.println("Status [" + status + "]: Status Updated Received");
                }
            }
        };

        System.out.println("\n-- Delivery Tracking Updates --");
        statusTracker.updateStatus("ORDER_PLACED");
        statusTracker.updateStatus("PREPARING");
        statusTracker.updateStatus("OUT_FOR_DELIVERY");
        statusTracker.updateStatus("DELIVERED");
        sc.close();
    }
}