// Assignment 9 - Exercise 2: Library Book Management using final class and method
import java.util.*;
final class LibraryBook // Final class (cannot be inherited)
{
   final String isbn; // Final variable
   String title;
   String author;
   double price;
   LibraryBook(String i, String t, String a, double p) // Constructor
   {
       isbn=i;
       title=t;
       author=a;
       price=p;
   }
   final void display() // Final method (cannot be overridden)
   {
       System.out.println("\n--- Book Details ---");
       System.out.println("ISBN: " + isbn);
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Price: $" + price);
   }
}


public class LibraryBookManagementSystem
{
   public static void main(String args[]) // Main method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Book ISBN: ");
       String i = sc.nextLine();
       System.out.print("Enter Book Title: ");
       String t = sc.nextLine();
       System.out.print("Enter Book Author: ");
       String a = sc.nextLine();
       System.out.print("Enter Book Price: ");
       double p = sc.nextDouble();
      
       LibraryBook book = new LibraryBook(i, t, a, p); // Creating final class object
       book.display(); // Displaying book details
      
       sc.close(); // Closing scanner
   }
}
