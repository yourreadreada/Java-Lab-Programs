// Assignment 20 - Exercise 2: Student Records CRUD Operations (Roll, Name, Course, Marks)
import java.sql.*;
import java.util.*;
public class StudentCRUD
{
    public static void main(String args[]) // Main Method
    {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/sit_java"; // DB URL
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try // Try block
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
            Connection con = DriverManager.getConnection(url, user, pass); // Connecting to DB

            while(true)
            {
                System.out.println("\n-- Student Management System (CRUD) --"); // Menu
                System.out.println("1. Add Student (Create)");
                System.out.println("2. View All Students (Read)");
                System.out.println("3. Update Student Marks (Update)");
                System.out.println("4. Delete Student Record (Delete)");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                if(choice == 1) // CREATE
                {
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // Consuming newline
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine(); 
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine(); 
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble(); 

                    String sql = "INSERT INTO student_crud VALUES (?, ?, ?, ?)"; // Parameterized query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing query
                    ps.setInt(1, roll);
                    ps.setString(2, name);
                    ps.setString(3, course);
                    ps.setDouble(4, marks);
                    ps.executeUpdate(); // Executing insert
                    System.out.println("Student record added successfully!"); 
                    ps.close(); // Closing statement
                }
                else if(choice == 2) // READ
                {
                    Statement stmt = con.createStatement(); // Creating statement
                    ResultSet rs = stmt.executeQuery("SELECT * FROM student_crud"); // Executing read
                    System.out.println("\nRoll No\tName\t\tCourse\t\tMarks");
                    while(rs.next()) // Looping through results
                    {
                        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4));
                    }
                    rs.close(); // Closing ResultSet
                    stmt.close(); // Closing Statement
                }
                else if(choice == 3) // UPDATE
                {
                    System.out.print("Enter Roll Number to update: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    String sql = "UPDATE student_crud SET marks = ? WHERE roll_no = ?"; // Update query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing statement
                    ps.setDouble(1, newMarks);
                    ps.setInt(2, roll);
                    int rows = ps.executeUpdate(); // Executing update
                    if(rows > 0) System.out.println("Marks updated successfully!");
                    else System.out.println("Student roll number not found.");
                    ps.close(); // Closing statement
                }
                else if(choice == 4) // DELETE
                {
                    System.out.print("Enter Roll Number to delete: ");
                    int roll = sc.nextInt();

                    String sql = "DELETE FROM student_crud WHERE roll_no = ?"; // Delete query
                    PreparedStatement ps = con.prepareStatement(sql); // Preparing statement
                    ps.setInt(1, roll);
                    int rows = ps.executeUpdate(); // Executing deletion
                    if(rows > 0) System.out.println("Student record deleted successfully!");
                    else System.out.println("Student roll number not found.");
                    ps.close(); // Closing statement
                }
                else if(choice == 5) // EXIT
                {
                    System.out.println("Exiting Student System...");
                    break;
                }
            }
            con.close(); // Closing connection
        }
        catch(Exception e) // Catching exceptions
        {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}