// Assignment 6 - Exercise 1: Vehicle Application using Inner and Anonymous Classes
import java.util.*;
class VehicleAction // Base class for anonymous class
{
    void performAction() // Method to be overridden
    {
        System.out.println("Vehicle default action started."); // Default print
    }
}
public class Vehicle
{
    String brand; // Outer class variable
    class VehicleDetails // Inner class
    {
        void display() // Inner class method
        {
            System.out.println("Registered Vehicle Brand: " + brand); // Accessing outer class variable
        }
    }

    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        Vehicle v = new Vehicle(); // Outer class instance
        
        System.out.print("Enter Vehicle Brand: ");
        v.brand = sc.nextLine();
        
        Vehicle.VehicleDetails details = v.new VehicleDetails(); // Instantiating inner class
        details.display(); // Calling inner class method

        VehicleAction action = new VehicleAction() // Creating anonymous class
        {
            void performAction() // Overriding base method
            {
                System.out.println("Action: Vehicle engine started and ready to drive!");
            }
        };
        action.performAction(); // Executing anonymous class method
        sc.close();
    }
}