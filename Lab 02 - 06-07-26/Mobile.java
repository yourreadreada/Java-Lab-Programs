// Assignment 2 - Exercise 2: Mobile Phone Inventory System
import java.util.*;

public class Mobile
{
   String brand;
   double price;

   Mobile(String brand, double price) // Parameterized Constructor
   {
       this.brand = brand;
       this.price = price;
   }

   Mobile(Mobile m) // Copy Constructor
   {
       this.brand = m.brand;
       this.price = m.price;
   }

   void display()
   {
       System.out.println("Brand: " + brand + ", Price: $" + price);
   }

   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Mobile Brand: ");
       String mbrand = sc.nextLine();
       System.out.print("Enter Mobile Price: ");
       double mprice = sc.nextDouble();
       sc.close();

       // Original object
       Mobile m1 = new Mobile(mbrand, mprice);
       System.out.print("Original Mobile Record: ");
       m1.display();

       // Duplicate object using Copy Constructor
       Mobile m2 = new Mobile(m1);
       System.out.print("Duplicate Mobile Record: ");
       m2.display();
   }
}