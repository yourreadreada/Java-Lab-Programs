// Assignment 8 - Exercise 1: Employee and Manager using super keyword
import java.util.*;
class Employee // Parent class
{
   String name;
   int id;
   Employee(String n, int i) // Parent constructor
   {
       name=n;
       id=i;
   }
   void display() // Parent display method
   {
       System.out.println("\n-- Employee Details --");
       System.out.println("ID: " +id);
       System.out.println("Name: " +name);
   }
}


class Manager extends Employee // Child class
{
   double bonus;
   Manager(String n, int i, double b) // Child constructor
   {
       super(n, i); // Calling parent constructor using super
       bonus = b;
   }
   void display() // Child display method overriding parent
   {
       super.display(); // Calling parent method using super
       System.out.println("Bonus: $" + bonus);
   }
}


public class EmployeeManagerSuperKeyword
{
   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Manager ID: ");
       int mid = sc.nextInt();
       sc.nextLine(); // Consuming leftover newline
       System.out.print("Enter Manager Name: ");
       String mname = sc.nextLine();
       System.out.print("Enter Manager Bonus: ");
       double mbon = sc.nextDouble();
      
       Manager m = new Manager(mname, mid, mbon); // Creating manager object
       m.display(); // Displaying details
       sc.close();
   }
}