// Assignment 13 - Exercise 1: Writing and Reading text using FileWriter and FileReader
import java.io.*;
import java.util.*;
public class FileReadWrite
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter text to write into file: ");
       String text = sc.nextLine(); // Reading text from user
      
       try // Handling file exceptions
       {
           FileWriter fw = new FileWriter("output.txt"); // Creating FileWriter object
           fw.write(text); // Writing string data into file
           fw.close(); // Closing FileWriter
           System.out.println("Data successfully written to file!");
          
           FileReader fr = new FileReader("output.txt"); // Creating FileReader object
           System.out.print("Reading content from file: "); // Header
           int ch; // Variable to store character ASCII value
           while((ch = fr.read()) != -1) // Reading characters until EOF (-1)
           {
               System.out.print((char)ch); // Displaying character
           }
           System.out.println(""); // Blank line
           fr.close(); // Closing FileReader
       }
       catch(IOException e) // Catching I/O exceptions
       {
           System.out.println("File Error: " + e.getMessage()); // Error message
       }


       sc.close();
   }
}