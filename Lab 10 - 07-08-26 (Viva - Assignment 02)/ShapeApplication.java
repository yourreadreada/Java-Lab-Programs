// Assignment 7 - Exercise 1: Shape application using Inheritance and Interfaces
import java.util.*;
interface Drawable // Interface demonstration for abstraction
{
   void draw(); // Abstract method to be implemented by child classes
}


class Shape // Parent class demonstrating inheritance
{
   String color;
   Shape(String c) // Parent constructor
   {
       color=c;
   }
}


class Circle extends Shape implements Drawable // Inheriting Shape and implementing Drawable
{
   double r; // Radius
   Circle(String c, double rad) // Child constructor
   {
       super(c); // Calling parent constructor to set color
       r=rad; // Assigning radius
   }


   public void draw() // Overriding interface method
   {
       System.out.println("Drawing a " + color + " Circle.");
       System.out.println("Area = " + (3.14*r*r));
   }
}


class Rectangle extends Shape implements Drawable // Inheriting Shape and implementing Drawable
{
   double l, b;
   Rectangle(String c, double len, double bre) // Child constructor
   {
       super(c); // Calling parent constructor to set color
       l=len;
       b=bre;
   }
  
   public void draw() // Overriding interface method
   {
       System.out.println("Drawing a " + color + " Rectangle.");
       System.out.println("Area = " + (l*b));
   }
}


public class ShapeApplication
{
   public static void main(String args[]) // Main Method
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Circle Details: ");
       System.out.print("Colour: ");
       String cc = sc.next();
       System.out.print("Radius: ");
       double cr = sc.nextDouble();
      
       System.out.println("");
       System.out.println("Enter Rectangle Details: ");
       System.out.print("Colour: ");
       String rc = sc.next();
       System.out.print("Length: ");
       double rl = sc.nextDouble();
       System.out.print("Breadth: ");
       double rb = sc.nextDouble();
      
       Circle c = new Circle(cc, cr); // Object creation for Circle
       Rectangle r = new Rectangle(rc, rl, rb); // Object creation for Rectangle
      
       System.out.println("");
       c.draw(); // Calling circle method
       System.out.println("");
       r.draw(); // Calling rectangle method


       sc.close();
   }
}