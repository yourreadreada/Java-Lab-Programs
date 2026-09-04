import javax.swing.*; // Swing & GUI Components
import java.awt.*; // FlowLayout
import java.awt.event.*; // ActionEvent and ActionListener

public class ButtonDemoModified extends JFrame implements ActionListener // Main Class
{
    // GUI Components
    JButton button;
    JLabel label;
    
    // State variable to track the toggle state
    boolean isFirstClick = true; 

    // Constructor
    ButtonDemoModified()
    {
        // Create Label
        label = new JLabel("Click the button");
        // Create Button
        button = new JButton("Click Me");
        // Register button with ActionListener
        button.addActionListener(this);
        // Set layout
        setLayout(new FlowLayout());
        // Add components to frame
        add(label);
        add(button);
        // Set frame properties
        setSize(300,150);
        setTitle("Button Event Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) // Event handling method
    {
        // Toggle the label and state based on the current click
        if (isFirstClick) 
        {
            label.setText("Button Clicked!");
            button.setText("Click Again"); // Changes the button text too
            isFirstClick = false; // Switch state for the next click
        } else 
        {
            label.setText("Clicked Again!");
            button.setText("Click Me"); // Resets the button text
            isFirstClick = true; // Switch state back
        }
    }

    public static void main(String args[])
    {
        new ButtonDemoModified();
    }
}