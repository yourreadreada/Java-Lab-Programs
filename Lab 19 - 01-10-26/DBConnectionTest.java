// Assignment 21 - Exercise 1: Connect Java with Database and Display Status
import java.sql.*;
public class DBConnectionTest
{
    public static void main(String args[]) // Main Method
    {
        String url = "jdbc:mysql://localhost:3306/student_db"; // Database URL
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try // Try block
        {
            System.out.println("Loading MySQL JDBC Driver..."); // Driver loading message
            Class.forName("com.mysql.cj.jdbc.Driver"); // Loading driver dynamically
            System.out.println("Driver loaded successfully!");

            System.out.println("Attempting connection to database server..."); // Attempt message
            Connection con = DriverManager.getConnection(url, user, pass); // Establishing connection using DriverManager

            if(con != null && !con.isClosed()) // Verifying connection status
            {
                System.out.println("\n[SUCCESS] Database Connection Status: CONNECTED"); // Status confirmation
                System.out.println("Connected to: " + con.getMetaData().getDatabaseProductName());
                System.out.println("Driver Version: " + con.getMetaData().getDriverVersion()); // Displaying driver version
            }
            else // Closed condition
            {
                System.out.println("\n[FAILED] Database Connection Status: NOT CONNECTED"); // Failure status
            }

            con.close(); // Closing connection session
            System.out.println("Database connection closed cleanly.");
        }
        catch(ClassNotFoundException e) // Catching missing driver jar
        {
            System.out.println("Driver Error: MySQL JDBC Driver not found in classpath!"); // Driver error
        }
        catch(SQLException e) // Catching connection/credential errors
        {
            System.out.println("SQL Connection Error: " + e.getMessage()); // SQL error
        }
    }
}