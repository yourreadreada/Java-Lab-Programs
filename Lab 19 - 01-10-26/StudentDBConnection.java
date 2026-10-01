// Assignment 21 - Exercise 2: Connect to Student Database and Display Confirmation Message
import java.sql.*;

public class StudentDBConnection
{
    public static void main(String args[]) // Main Method
    {
        String url = "jdbc:mysql://localhost:3306/student_db"; // URL targeting student_db
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try // Exception handling block
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
            Connection con = DriverManager.getConnection(url, user, pass); // Connecting via DriverManager

            if(con != null && !con.isClosed()) // Validating connection
            {
                String dbName = con.getCatalog(); // Fetching current database name from connection session
                System.out.println("Connection Status: ACTIVE");
                System.out.println("Message: The " + dbName + " database is connected successfully!");

                Statement stmt = con.createStatement(); // Creating Statement to explore interface
                ResultSet rs = stmt.executeQuery("SELECT DATABASE()"); // Querying active DB catalog
                if(rs.next())
                {
                    System.out.println("Verified Active Catalog from Server: " + rs.getString(1));
                }

                rs.close(); // Closing ResultSet
                stmt.close(); // Closing Statement
            }
            con.close(); // Closing Connection
        }
        catch(Exception e) // Catching general connection exceptions
        {
            System.out.println("Connection Failed: " + e.getMessage()); // Error message
        }
    }
}