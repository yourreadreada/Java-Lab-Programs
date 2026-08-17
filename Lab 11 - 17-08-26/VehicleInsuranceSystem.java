// Assignment 8 - Exercise 2: Vehicle Insurance System using super keyword
import java.util.*;
class Vehicle // Parent class
{
   String regNo;
   String brand;
   Vehicle(String r, String b) // Parent constructor
   {
       regNo=r;
       brand=b;
   }
}


class Insurance extends Vehicle // Child class
{
   String policyNo;
   double premium;
   Insurance(String r, String b, String p, double amt) // Child constructor
   {
       super(r, b); // Calling parent constructor using super
       policyNo = p;
       premium = amt;
   }
   void showDetails() // Method to display all details
   {
       System.out.println("\n-- Insurance Details --");
       System.out.println("Vehicle Reg No: " + super.regNo); // Accessing parent variable using super
       System.out.println("Vehicle Brand: " + super.brand); // Accessing parent variable using super
       System.out.println("Policy Number: " + policyNo);
       System.out.println("Premium Amount: $" + premium);
   }
}


public class VehicleInsuranceSystem
{
   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Vehicle Registration No: ");
       String vr = sc.next();
       System.out.print("Enter Vehicle Brand: ");
       String vb = sc.next();
       System.out.print("Enter Policy Number: ");
       String ip = sc.next();
       System.out.print("Enter Premium Amount: ");
       double ia = sc.nextDouble();
      
       Insurance ins = new Insurance(vr, vb, ip, ia); // Creating child object
       ins.showDetails(); // Displaying details
       sc.close(); // Closing scanner
   }
}