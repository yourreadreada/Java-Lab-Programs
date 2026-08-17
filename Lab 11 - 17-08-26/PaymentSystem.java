// Assignment 10 - Exercise 1: Abstract Payment Class
import java.util.*;
abstract class Payment // Abstract class
{
   abstract void processPayment(double amt); // Abstract method
}


class CreditCard extends Payment // Child Class 1
{
   String cardNo;
   CreditCard(String c) // Constructor
   {
       cardNo = c;
   }
   void processPayment(double amt) // Implementing abstract method
   {
       System.out.println("Processing Credit Card payment of $" + amt + " for Card No: " + cardNo);
   }
}
class UPI extends Payment // Child Class 2
{
   String upiId;
   UPI(String u) // Constructor
   {
       upiId = u;
   }
   void processPayment(double amt) // Implementing abstract method
   {
       System.out.println("Processing UPI payment of $" + amt + " for UPI ID: " + upiId);
   }
}


public class PaymentSystem
{
   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Credit Card Number: ");
       String c = sc.next();
       System.out.print("Enter CC Payment Amount: ");
       double camt = sc.nextDouble();
       System.out.print("Enter UPI ID: ");
       String u = sc.next();
       System.out.print("Enter UPI Payment Amount: ");
       double uamt = sc.nextDouble();
      
       Payment p1 = new CreditCard(c); // Upcasting
       Payment p2 = new UPI(u); // Upcasting
      
       System.out.println("\n-- Transaction Status --");
       p1.processPayment(camt); // Calling overridden CC method
       p2.processPayment(uamt); // Calling overridden UPI method
       sc.close();
   }
}
