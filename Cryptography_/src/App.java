import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame {

    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Cryptography Application");
        // Create a JFrame (window)
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window

        ////Customize buy myself
        // frame.getContentPane().setBackground(Color.); ///color set "#009CDE"
        frame.getContentPane().setBackground(Color.decode("#009CDE")); ///color set "#009CDE"

        ///Create a main panel for centering the grid
        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.setBackground(Color.decode("#009CDE"));
        ///Create Panel with gridLayout
        JPanel gridJPanel = new JPanel(new GridLayout(0, 2, 0, 10));

        ///make custom height for text field and selection field
        Dimension inputFieldSize = new Dimension(120, 2);

        ///Create label and text field
        JLabel plaintextLabel = new JLabel("Entyer your plain text");
        JTextField plainTextField = new JTextField(10);

        gridJPanel.add(plaintextLabel);
        gridJPanel.add(plainTextField);
        plainTextField.setPreferredSize(inputFieldSize);
        ///reduced internal padding of text field
        plainTextField.setMargin(new Insets(2, 5, 2, 5));

        ///Create label and selection input field
        JLabel selectAlgoLabel = new JLabel("Select your algorithm");
        String[] algoString = new String[] { "AES", "DES", "RSA" };
        JComboBox selectComboBox = new JComboBox<>(algoString);
        gridJPanel.add(selectAlgoLabel);
        gridJPanel.add(selectComboBox);

        ///Create label and key input value
        gridJPanel.add(new JLabel("Enter the key"));
        gridJPanel.add(new JTextField(10));

        ///Create label and output field
        gridJPanel.add(new JLabel("Cipher text"));
        gridJPanel.add(new JTextField(10));

        // Wrap the grid in an empty border to create margin
        gridJPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        ///Center the main grid using wrapper panel

        mainPanel.add(gridJPanel, BorderLayout.CENTER);

        ///Add frame into the panel
        frame.add(mainPanel);

        // Make window visible
        frame.setVisible(true);
    }
}
