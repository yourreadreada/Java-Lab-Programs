// Assignment 2 - Exercise 1: Student Class
import java.util.*;
public class Student
{
   String name;
   int roll;

   Student() // Default Constructor
   {
       name = "Unknown";
       roll = 0;
   }

   Student(String name, int roll) // Parameterized Constructor
   {
       this.name = name;
       this.roll = roll;
   }

   void display()
   {
       System.out.println("Student Name: " + name + ", Roll No: " + roll);
   }

   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);

       // Default Constructor
       Student s1 = new Student();
       System.out.print("Default Record: ");
       s1.display();

       // Parameterized Constructor
       System.out.print("\nEnter Student Name: ");
       String sname = sc.nextLine();
       System.out.print("Enter Student Roll No: ");
       int sroll = sc.nextInt();
       sc.close();


       Student s2 = new Student(sname, sroll);
       System.out.print("Parameterized Record: ");
       s2.display();
   }
}
