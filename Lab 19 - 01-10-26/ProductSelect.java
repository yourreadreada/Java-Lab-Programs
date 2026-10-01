// Assignment 19 - Exercise 2: Connect to DB and display product details using SELECT
import java.sql.*;
public class ProductSelect
{
    public static void main(String args[]) // Main Method
    {
        String url = "jdbc:mysql://localhost:3306/sit_java"; // Database URL
        String user = "thegharkalaptop"; // DB Username
        String pass = ""; // DB Password

        try // Try block
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver
            Connection con = DriverManager.getConnection(url, user, pass); // Connecting to DB
            Statement stmt = con.createStatement(); // Creating statement

            String query = "SELECT product_id, product_name, quantity, price FROM product"; // SELECT query
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("== Product Inventory List ==");
            System.out.println("ID\tProduct Name\t\tQuantity\tPrice ($)");

            while(rs.next()) // Traversing ResultSet
            {
                int pid = rs.getInt("product_id"); 
                String pname = rs.getString("product_name"); 
                int qty = rs.getInt("quantity");
                double price = rs.getDouble("price");

                System.out.println(pid + "\t" + pname + "\t" + qty + "\t\t" + price); // Displaying record
            }

            rs.close(); // Closing ResultSet
            stmt.close(); // Closing Statement
            con.close(); // Closing Connection
        }
        catch(Exception e) // Catching exceptions
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}