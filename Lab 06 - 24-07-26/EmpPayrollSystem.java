// Assignment 4 - Exercise 2: Employee Payroll System using wrapper validation
import java.util.Scanner;
public class EmpPayrollSystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The Following Details:");
        System.out.print("Employee ID: ");
        int empid=sc.nextInt();
        System.out.print("Basic Salary: ");
        double basic=sc.nextDouble();
        System.out.print("Bonus Amount: ");
        double bonus=sc.nextDouble();
        System.out.println("");

        double deductions=0.0;
        System.out.println("Enter Whether Using New Tax Regime or Old Tax Regime:");
        System.out.println("'1' For New Tax Regime");
        System.out.println("'2' For Old Tax Regime");
        int choice=sc.nextInt();
        sc.close();
        System.out.println("");

        if(choice == 1)
        {
            deductions = basic * 0.05; // 5% flat tax deduction
            System.out.println("New Tax Regime Applied (5% Tax Deduction).");
        }
        else if(choice == 2)
        {
            deductions = basic * 0.10; // 10% flat tax deduction
            System.out.println("Old Tax Regime Applied (10% Tax Deduction).");
        }
        else
        {
            System.out.println("Invalid Input. Select One Tax Slab Please.");
        }
        // Primitive Type To Wrapper Object
        Integer empidobj=empid;
        Double basicobj=basic;
        Double bonusobj=bonus;

        if(empidobj <= 0)
        {
            System.out.println("Invalid. Employee ID must be greater than 0.");
        }
        else if(basicobj <= 0)
        {
            System.out.println("Invalid. Basic Salary must be greater than 0.");
        }
        else if(bonusobj <= 0)
        {
            System.out.println("Invalid. Bonus Amount must be greater than 0.");
        }
        else
        {
            double net = basicobj + bonusobj + deductions;
            System.out.println("\n- Employee Payroll Summary -");
            System.out.println("Employee ID: " +empidobj);
            System.out.println("Basic Salary: ₹" +basicobj);
            System.out.println("Bonus: ₹" +bonusobj);
            System.out.println("Tax Deductions: -₹" +deductions);
            System.out.println("Net Salary: ₹" +net);
        }
    }
}