// Assignment 10 - Exercise 2: Abstract FoodOrder Class
import java.util.*;
abstract class FoodOrder // Abstract class
{
   double baseAmount;
   FoodOrder(double amt) // Constructor for abstract class
   {
       baseAmount = amt;
   }
   abstract void calculateBill(); // Abstract method
}


class DineInOrder extends FoodOrder // Child Class 1
{
   double serviceCharge;
   DineInOrder(double amt, double sc) // Constructor
   {
       super(amt); // Initializing parent property
       serviceCharge = sc;
   }
   void calculateBill() // Implementing abstract method
   {
       double total = baseAmount + serviceCharge;
       System.out.println("Dine-In Total Bill: $" + total + " (Includes Service Charge: $" + serviceCharge + ")");
   }
}


class TakeAwayOrder extends FoodOrder // Child Class 2
{
   double packingCharge;
   TakeAwayOrder(double amt, double pc) // Constructor
   {
       super(amt); // Initializing parent property
       packingCharge = pc;
   }
   void calculateBill() // Implementing abstract method
   {
       double total = baseAmount + packingCharge;
       System.out.println("Take-Away Total Bill: $" + total + " (Includes Packing Charge: $" + packingCharge + ")");
   }
}


public class FoodOrderSystem
{
   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Dine-In Base Amount: ");
       double da = sc.nextDouble();
       System.out.print("Enter Service Charge: ");
       double scg = sc.nextDouble();
       System.out.print("\nEnter Take-Away Base Amount: ");
       double ta = sc.nextDouble();
       System.out.print("Enter Packing Charge: ");
       double pcg = sc.nextDouble();
      
       FoodOrder f1 = new DineInOrder(da, scg); // Instantiating DineInOrder
       FoodOrder f2 = new TakeAwayOrder(ta, pcg); // Instantiating TakeAwayOrder
      
       System.out.println("\n-- Order Bills --");
       f1.calculateBill(); // Executing DineIn bill calculation
       f2.calculateBill(); // Executing TakeAway bill calculation
       sc.close();
   }
}
