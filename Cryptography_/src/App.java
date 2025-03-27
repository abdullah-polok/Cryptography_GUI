import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame {

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Cryptography Application");
        // Create a JFrame (window)
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window

        ////Customize buy myself
        // frame.getContentPane().setBackground(Color.); ///color set "#009CDE"
        frame.getContentPane().setBackground(Color.decode("#009CDE")); ///color set "#009CDE"
        ///Create a main panel for centering the grid
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin
        mainPanel.setBackground(Color.decode("#009CDE"));

        ///Create Panel with gridLayout
        JPanel gridJPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        gridJPanel.setBackground(Color.decode("#009CDE"));
        ///Create label and text field
        JLabel plaintextLabel = new JLabel("Entyer your plain text");
        JTextField plainTextField = new JTextField(15);
        gridJPanel.add(plaintextLabel);
        gridJPanel.add(plainTextField);

        ///Create label and selection input field
        JLabel selectAlgoLabel = new JLabel("Select your algorithm");
        String[] algoString = new String[] { "AES", "DES", "RSA" };
        JComboBox selectComboBox = new JComboBox<>(algoString);
        gridJPanel.add(selectAlgoLabel);
        gridJPanel.add(selectComboBox);

        ///Create label and key input value
        JLabel keyLabel = new JLabel("Enter the key");
        JTextField KeyTextField = new JTextField(15);
        gridJPanel.add(keyLabel);
        gridJPanel.add(KeyTextField);

        ///Create label and output field
        JLabel cipherLabel = new JLabel("Cipher text");
        JTextField chiperTextField = new JTextField(15);
        gridJPanel.add(cipherLabel);
        gridJPanel.add(chiperTextField);

        // Create Execute Button in Separate Panel
        JPanel buttonPanel = new JPanel();
        JButton executeButton = new JButton("Execute");
        buttonPanel.add(executeButton);

        ///Center the main grid using wrapper panel

        mainPanel.add(gridJPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        ///Add frame into the panel
        frame.add(mainPanel);

        // Make window visible
        frame.setVisible(true);
    }
}
