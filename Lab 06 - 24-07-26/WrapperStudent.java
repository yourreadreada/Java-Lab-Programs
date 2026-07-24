// Assignment 4 - Exercise 1: Wrapper class conversion for student marks
import java.util.*;
public class WrapperStudent
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks: ");
        String m1 = sc.next();
        System.out.print("Enter Subject 2 Marks: ");
        String m2 = sc.next();
        
        Integer marks1 = Integer.valueOf(m1); // Converting String to Integer object
        Integer marks2 = Integer.valueOf(m2); // Converting String to Integer object
        
        int total = marks1 + marks2; // Auto-unboxing and arithmetic addition
        System.out.println("Total Marks: " + total); // Displaying total
        sc.close(); // Closing scanner
    }
}