// Assignment 20 - Exercise 1: Employee Records CRUD Operations
import java.sql.*;
import java.util.*;
public class EmployeeCRUD
{
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/sit_java"; // DB URL
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
            Connection con = DriverManager.getConnection(url, user, pass); // Connecting to DB

            while(true) // Menu loop
            {
                System.out.println("\n-- Employee CRUD Operations --"); // Menu
                System.out.println("1. Create (Insert) Employee");
                System.out.println("2. Read (View) Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee Record");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if(choice == 1) // INSERT
                {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consuming newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();

                    String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)"; // Parameterized query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing statement
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, dept);
                    ps.setDouble(4, sal);
                    ps.executeUpdate(); // Executing DML
                    System.out.println("Employee record inserted successfully!");
                    ps.close(); // Closing PreparedStatement
                }
                else if(choice == 2) // SELECT
                {
                    Statement stmt = con.createStatement(); // Creating Statement
                    ResultSet rs = stmt.executeQuery("SELECT * FROM employee"); // Executing SELECT
                    System.out.println("\nID\tName\t\tDepartment\tSalary");
                    while(rs.next()) // Traversing records
                    {
                        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4));
                    }
                    rs.close();
                    stmt.close(); // Closing Statement
                }
                else if(choice == 3) // UPDATE
                {
                    System.out.print("Enter Employee ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSal = sc.nextDouble();

                    String sql = "UPDATE employee SET salary = ? WHERE emp_id = ?"; // UPDATE query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing statement
                    ps.setDouble(1, newSal);
                    ps.setInt(2, id);
                    int rows = ps.executeUpdate(); // Executing update
                    if(rows > 0) System.out.println("Salary updated successfully!");
                    else System.out.println("Employee ID not found.");
                    ps.close(); // Closing PreparedStatement
                }
                else if(choice == 4) // DELETE
                {
                    System.out.print("Enter Employee ID to delete: ");
                    int id = sc.nextInt();

                    String sql = "DELETE FROM employee WHERE emp_id = ?"; // DELETE query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing statement
                    ps.setInt(1, id); // Binding ID
                    int rows = ps.executeUpdate(); // Executing delete
                    if(rows > 0) System.out.println("Employee deleted successfully!");
                    else System.out.println("Employee ID not found.");
                    ps.close(); // Closing PreparedStatement
                }
                else if(choice == 5) // EXIT
                {
                    System.out.println("Exiting application...");
                    break;
                }
            }
            con.close(); // Closing DB Connection
        }
        catch(Exception e) // Catching exceptions
        {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}