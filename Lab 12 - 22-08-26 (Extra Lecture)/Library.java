// File 2: Library.java (Main Program)
import library.Book; // Importing user-defined package class
import java.util.*;
public class Library
{
   public static void main(String args[]) // Main method
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Book ID: ");
       int bid = sc.nextInt();
       sc.nextLine(); // Consuming newline
       System.out.print("Enter Book Title: ");
       String bt = sc.nextLine();
       System.out.print("Enter Book Author: ");
       String ba = sc.nextLine();
       System.out.print("Enter Book Price: ");
       double bp = sc.nextDouble();
      
       Book bObject = new Book(); // Creating instance from library package
      
       System.out.println("\n-- Library Record --");
       bObject.displayBook(bid, bt, ba, bp); // Calling package method
       sc.close();
   }
}