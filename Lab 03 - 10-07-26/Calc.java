import java.util.Scanner;
public class Calc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        if(b!=0)
            System.out.println("Division = "+(a/b));
        else
            System.out.println("Division By Zero Is Not Possible.");
        System.out.println("Remainder = "+(a%b));
        System.out.println("Power: "+a+" raised to "+b+" = "+(int)(Math.pow(a, b)));
    }
}