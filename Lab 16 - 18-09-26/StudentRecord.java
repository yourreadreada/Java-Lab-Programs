// Assignment 13 - Exercise 2: Storing and Reading Student Records using Files
import java.io.*;
import java.util.*;
public class StudentRecord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Student Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine(); // Consuming newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Branch: ");
        String branch = sc.nextLine();
        
        try
        {
            FileWriter writer = new FileWriter("students.txt"); // Opening file for writing
            writer.write("Roll No: " + roll + "\nName: " + name + "\nBranch: " + branch + "\n"); // Writing details
            writer.close(); // Closing stream
            System.out.println("Student record stored successfully!");
            
            File file = new File("students.txt"); // Creating File object
            Scanner fileReader = new Scanner(file); // Scanner to read from file
            
            System.out.println("\n--- Fetching Student Details from File ---"); // Section header
            while(fileReader.hasNextLine()) // Iterating line-by-line
            {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close(); // Closing file scanner
        }
        catch(IOException e)
        {
            System.out.println("An error occurred: " + e.getMessage()); // Error message
        }
        sc.close();
    }
}