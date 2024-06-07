import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample extends JFrame implements ActionListener {
    private JButton button1, button2;

    public ActionEventExample() {
        // Create a panel to hold the buttons
        JPanel panel = new JPanel();

        // Create two buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        // Add action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Add buttons to the panel
        panel.add(button1);
        panel.add(button2);

        // Add panel to the frame
        add(panel);

        // Set frame properties
        setTitle("ActionEvent Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the event ID
        int eventId = e.getID();

        // Check which button was clicked
        if (e.getSource() == button1) {
            System.out.println("Button 1 clicked. Event ID: " + eventId);
        } else if (e.getSource() == button2) {
            System.out.println("Button 2 clicked. Event ID: " + eventId);
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        new ActionEventExample();
    }
}
