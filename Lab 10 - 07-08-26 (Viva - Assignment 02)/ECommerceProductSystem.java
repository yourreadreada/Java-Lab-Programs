// Assignment 7 - Exercise 2: E-Commerce Product System using Inheritance and Interfaces
import java.util.*;
interface Billable // Interface for product actions
{
    void generateBill(); // Abstract method for billing
}

class Product // Parent class for common properties
{
    String name;
    double price;
    Product(String n, double p) // Constructor
    {
        name=n;
        price=p;
    }
}

class Electronic extends Product implements Billable // Inheriting Product and implementing Billable
{
    int warranty; // Specific property for electronics
    Electronic(String n, double p, int w) // Constructor
    {
        super(n,p); // Parent initialization for name and price
        warranty=w;
    }
    public void generateBill() // Implementing interface method
    {
        System.out.println("Electronic: " + name + " | Price: $" + price + " | Warranty: " + warranty + " months");
    }
}

class Clothing extends Product implements Billable // Inheriting Product and implementing Billable
{
    String size;
    Clothing(String n, double p, String s) // Constructor
    {
        super(n,p); // Parent initialization for name and price
        size=s;
    }
    public void generateBill() // Implementing interface method
    {
        System.out.println("Clothing: " + name + " | Price: $" + price + " | Size: " + size);
    }
}

class Grocery extends Product implements Billable // Inheriting Product and implementing Billable
{
    String expiry;
    
    Grocery(String n, double p, String e) // Constructor
    {
        super(n, p); // Parent initialization for name and price
        expiry = e;
    }
    public void generateBill() // Implementing interface method
    {
        System.out.println("Grocery: " + name + " | Price: $" + price + " | Expiry: " + expiry);
    }
}

public class ECommerceProductSystem
{
    public static void main(String args[]) // Main method
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Laptop Details: ");
        System.out.print("Name: ");
        String en = sc.nextLine();
        System.out.print("Price: ");
        double ep = sc.nextDouble();
        System.out.print("Warranty (Months): ");
        int ew = sc.nextInt();
        
        System.out.println("");
        System.out.println("Enter T-Shirt Details: ");
        System.out.print("Name: ");
        String cn = sc.next();
        System.out.print("Price: ");
        double cp = sc.nextDouble();
        System.out.print("Size: ");
        String cs = sc.next();
        
        System.out.println("");
        System.out.println("Enter Milk Details: ");
        System.out.print("Brand: ");
        String gn = sc.next();
        System.out.print("Price: ");
        double gp = sc.nextDouble();
        System.out.print("Expiry Date: ");
        String ge = sc.next(); 
        
        Electronic e = new Electronic(en, ep, ew); // Electronic object creation
        Clothing c = new Clothing(cn, cp, cs); // Clothing object creation
        Grocery g = new Grocery(gn, gp, ge); // Grocery object creation
        
        System.out.println("");
        System.out.println("\n- E-Commerce Bill -");
        e.generateBill(); // Calling electronic billing
        c.generateBill(); // Calling clothing billing
        g.generateBill(); // Calling grocery billing
        
        sc.close();
    }
}