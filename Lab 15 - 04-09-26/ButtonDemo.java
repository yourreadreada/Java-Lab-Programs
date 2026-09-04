import javax.swing.*; // Swing & GUI Components
import java.awt.*; // FlowLayount
import java.awt.event.*; // ActionEvent and ActionListener

public class ButtonDemo extends JFrame implements ActionListener // Main Class
{
    // GUI Components
    JButton button;
    JLabel label;

    // Constructor
    ButtonDemo()
    {
        // Create Label
        label=new JLabel("Click the button");
        // Create Button
        button=new JButton("Click Me");
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
        // Change label when button is clicked
        label.setText("Button Clicked!");
    }

    public static void main(String args[])
    {
        new ButtonDemo();
    }
}