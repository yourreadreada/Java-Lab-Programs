// Assignment 19 - Exercise 1: Display Student Records using SELECT Query
import java.sql.*;
public class StudentSelect
{
    public static void main(String args[]) // Main method
    {
        String url = "jdbc:mysql://localhost:3306/sit_java"; // Database URL
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try // Exception handling for JDBC
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering JDBC driver
            Connection con = DriverManager.getConnection(url, user, pass); // Establishing connection
            Statement stmt = con.createStatement(); // Creating Statement object

            String query = "SELECT roll_no, name, course, marks FROM student"; // SQL SELECT query
            ResultSet rs = stmt.executeQuery(query); // Executing query and getting ResultSet

            System.out.println("== Student Records from Database ==");
            System.out.println("Roll No\tName\t\tCourse\t\tMarks");

            while(rs.next()) // Iterating through cursor row by row
            {
                int roll = rs.getInt("roll_no"); 
                String name = rs.getString("name"); 
                String course = rs.getString("course"); 
                double marks = rs.getDouble("marks"); 

                System.out.println(roll + "\t" + name + "\t" + course + "\t" + marks); // Printing row
            }

            rs.close(); // Closing ResultSet
            stmt.close(); // Closing Statement
            con.close(); // Closing Connection
        }
        catch(Exception e) // Catching SQL and Driver exceptions
        {
            System.out.println("Database Error: " + e.getMessage()); 
        }
    }
}