// Assignment 17 - Exercise 2: Basic Java Applet
// HTML Run Code: <applet code="AppletDemo.class" width="350" height="200"></applet>
// Executing via Swing as Applet support has been deprecated.
import java.applet.Applet; // Applet package
import java.awt.*; // AWT graphics and fonts
import javax.swing.JFrame; // Swing JFrame container

public class AppletDemo extends Applet // Applet base class
{
    public void init() // Applet initialization lifecycle method
    {
        setBackground(Color.LIGHT_GRAY); // Setting background color
    }
    public void paint(Graphics g) // Paint lifecycle method for rendering graphics
    {
        g.setColor(Color.BLUE); // Drawing color
        g.setFont(new Font("Arial", Font.BOLD, 16)); // Text font
        g.drawString("Welcome to Java Applet Programming!", 30, 60);

        g.setColor(Color.RED); // Drawing color
        g.drawRect(30, 80, 280, 50); // Rectangle outline
        g.drawString("Symbiosis Institute of Technology", 45, 110);
    }

    public static void main(String args[]) // Main Method
    {
        JFrame frame = new JFrame("Applet Viewer"); // Creating top-level window frame
        AppletDemo applet = new AppletDemo(); // Creating instance of AppletDemo

        applet.init(); // Calling applet lifecycle initialization
        applet.start(); // Starting applet execution

        frame.add(applet); // Adding applet to frame container
        frame.setSize(365, 235); // Setting frame dimensions matching applet bounds
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing operation
        frame.setLocationRelativeTo(null); // Centering frame on screen
        frame.setVisible(true); // Displaying frame window
    }
}