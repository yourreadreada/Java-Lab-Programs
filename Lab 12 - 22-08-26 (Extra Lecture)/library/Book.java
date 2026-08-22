// File 1: library/Book.java
package library; // Package declaration
public class Book // Public class
{
   public void displayBook(int id, String title, String author, double price) // Public method
   {
       System.out.println("Book ID: " + id);
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Price: $" + price);
   }
}