// WAP in Java to develop a Calculator Program using overloaded methods for addition of integers and decimals. Use a static variable to count calculations.
import java.util.Scanner;
public class Assig01
{
    static int counter;

    public static int add(int a, int b) // Function To Add Two Integers
    {
        counter++;
        return (a+b);
    }

    public static double add(double c, double d) // Function To Add Two Decimal Numbers
    {
        counter++;
        return (c+d);
    }

    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Program:");
        System.out.println();

        System.out.println("Enter Two Integer Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Addition Of Two Integers = "+add(a,b));

        System.out.println();
        System.out.println("Enter Two Decimal Numbers: ");
        double c=sc.nextDouble();
        double d=sc.nextDouble();

        System.out.println("Addition Of Two Decimal Numbers = "+add(c,d));
    }
}