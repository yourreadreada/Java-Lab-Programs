// Assignment 3 - Exercise 1: Calculator using overloaded methods and static variable
import java.util.*;

public class Calculator
{
    static int calcCount = 0; // Static variable to count total calculations
    public static void add(int a, int b) // Overloaded method for integers
    {
        calcCount++; // Incrementing count
        System.out.println("Integer Sum: " + (a+b));
    }
    public static void add(double a, double b) // Overloaded method for decimals
    {
        calcCount++; // Incrementing count
        System.out.println("Decimal Sum: " + (a+b)); 
    }
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Integers: ");
        int i1 = sc.nextInt(); 
        int i2 = sc.nextInt();
        add(i1, i2); // Calling integer addition
        
        System.out.println("");
        System.out.print("Enter Two Decimals: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        add(d1, d2); // Calling decimal addition

        System.out.println("Total Calculations Performed: " + calcCount);
        sc.close();
    }
}