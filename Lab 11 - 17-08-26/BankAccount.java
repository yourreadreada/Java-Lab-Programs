// Assignment 9 - Exercise 1: Bank Account using final variable
import java.util.*;
public class BankAccount
{
   final int accNo; // Final variable declaration
   String name;
   double balance;
  
   BankAccount(int a, String n, double b) // Constructor
   {
       accNo=a; // Initializing final variable
       name=n;
       balance=b;
   }
   void display() // Display method
   {
       System.out.println("\n-- Account Details --");
       System.out.println("Account No (Final): " + accNo);
       System.out.println("Holder Name: " + name);
       System.out.println("Balance: $" + balance);
   }


   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Account Number: ");
       int an = sc.nextInt();
       sc.nextLine(); // Consuming newline
      
       System.out.print("Enter Account Holder Name: ");
       String hn = sc.nextLine();
      
       System.out.print("Enter Opening Balance: ");
       double bl = sc.nextDouble();
      
       BankAccount acc = new BankAccount(an, hn, bl); // Creating object
       acc.display(); // Displaying account details
      
       // acc.accNo = 12345; // Will give an error, as we cannot assign a value to the final variable
       sc.close();
   }
}