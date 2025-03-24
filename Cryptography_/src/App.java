import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class App {
    public static void main(String[] args) throws Exception {

        // Create a JFrame (window)
        JFrame frame = new JFrame("Cryptography application");
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window

        ////Customize buy myself
        // frame.getContentPane().setBackground(Color.); ///color set "#009CDE"
        frame.getContentPane().setBackground(Color.decode("#009CDE")); ///color set "#009CDE"

        ///Create a panel for holding label and input field
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        ///Create and add a Jlabel for text
        JLabel plainTextLabel = new JLabel("Enter you plain text");
        // plainTextLabel.setForeground(Color.white);

        ///Create a textinput field
        JTextField plTextArea = new JTextField(20); // Text field with 20 columns

        // Add the label and text field with gap
        panel.add(plainTextLabel);
        panel.add(Box.createVerticalStrut(20)); // Vertical gap of 20 pixels
        panel.add(plTextArea);

        // Add the panel to the frame
        frame.add(panel);

        // Make window visible
        frame.setVisible(true);
    }
}
