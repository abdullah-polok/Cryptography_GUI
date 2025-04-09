import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {

    static int key;
    static JComboBox selectComboBox;
    static JTextField plainTextField;
    static JTextField ciperTextField;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cryptography Application");

        // setup a JFrame (window)
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window

        ////Customize by myself
        // frame.getContentPane().setBackground(Color.); ///color set "#009CDE"
        frame.getContentPane().setBackground(Color.decode("#009CDE")); ///color set "#009CDE"

        ///setup a main panel for centering the grid
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin
        mainPanel.setBackground(Color.decode("#009CDE"));

        ///setup Panel with gridLayout
        JPanel gridJPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        gridJPanel.setBackground(Color.decode("#009CDE"));
        ///setup label and text field
        JLabel plaintextLabel = new JLabel("Enter your plain text");
        plainTextField = new JTextField(15);
        gridJPanel.add(plaintextLabel);
        gridJPanel.add(plainTextField);

        ///setup label and selection input field
        JLabel selectAlgoLabel = new JLabel("Select your algorithm");

        String[] algoString = new String[] { "Reverse cipher", "Rail Fence cipher", "Geometric Figure",
                "Columnar transposition cipher", "Double columnar transposition", "Row Transposition ciphers",
                "Nihilist Transposition ciphers" };

        selectComboBox = new JComboBox<>(algoString);

        gridJPanel.add(selectAlgoLabel);
        gridJPanel.add(selectComboBox);

        ///setup label and key input value
        JLabel keyLabel = new JLabel("Enter the key");
        JTextField KeyTextField = new JTextField(15);
        gridJPanel.add(keyLabel);
        gridJPanel.add(KeyTextField);

        ///setup label and output field
        JLabel cipherLabel = new JLabel("Cipher text");
        ciperTextField = new JTextField(15);
        gridJPanel.add(cipherLabel);
        gridJPanel.add(ciperTextField);

        // setup Execute Button in Separate Panel
        JPanel buttonPanel = new JPanel();
        JButton executeButton = new JButton("Execute");
        buttonPanel.add(executeButton);
        buttonPanel.setBackground(Color.decode("#009CDE"));
        executeButton.setForeground(Color.decode("#009CDE"));
        executeButton.setBackground(Color.white);

        ////Set all label in white color
        plaintextLabel.setForeground(Color.white);
        selectAlgoLabel.setForeground(Color.white);
        keyLabel.setForeground(Color.white);
        cipherLabel.setForeground(Color.white);

        ///set all label size bigger
        // Set custom font
        Font labelFont = new Font("Arial", Font.PLAIN, 14); // Bold, 14px

        plaintextLabel.setFont(labelFont);
        selectAlgoLabel.setFont(labelFont);
        keyLabel.setFont(labelFont);
        cipherLabel.setFont(labelFont);

        ///Center the main grid using gridPanel panel
        mainPanel.add(gridJPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        ///Event handler by button
        executeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                chooseEncryptAlgoString();

            }

        });

        ///Add frame into the panel
        frame.add(mainPanel);

        // Make window visible
        frame.setVisible(true);
    }

    public static void chooseEncryptAlgoString() {

        ///Coonvert comboBox value into string;
        String valueString = selectComboBox.getSelectedItem().toString();

        switch (valueString) {
            case "Reverse cipher":
                System.out.println(valueString);
                String getReverseCipherText = reverseCipher();
                ciperTextField.setText(getReverseCipherText);
                break;
            case "Rail Fence cipher":
                System.out.println(valueString);
                railFenceCipher();
                String getRailCipherText = railFenceCipher();
                ciperTextField.setText(getRailCipherText);
                break;
            case "Geometric Figure":
                System.out.println(valueString);
                geometricFigure();
                break;
            case "Columnar transposition cipher":
                System.out.println(valueString);
                columnarTranspositionCipher();
                break;
            case "Double columnar transposition":
                System.out.println(valueString);
                doubleColumnarTransposition();
                break;
            case "Row Transposition ciphers":
                System.out.println(valueString);
                rowTranspositionCiphers();
                break;
            case "Nihilist Transposition ciphers":
                System.out.println(valueString);
                nihilistTranspositionCiphers();
                break;

            default:
                break;
        }

    }

    public static String reverseCipher() {

        String plainText = plainTextField.getText();
        String reversed = "";
        for (int i = plainText.length() - 1; i >= 0; i--) {
            reversed += plainText.charAt(i);
        }
        return reversed;

    }

    public static String railFenceCipher() {

        String rail1 = "", rail2 = "";

        for (int i = 0; i < plainTextField.getText().length(); i++) {
            if (i % 2 == 0)
                rail1 += plainTextField.getText().charAt(i); // Even index
            else
                rail2 += plainTextField.getText().charAt(i); // Odd index
        }

        return rail1 + rail2;
    }

    public static String geometricFigure() {

        return "ddd";
    }

    public static String columnarTranspositionCipher() {

        return "ddd";
    }

    public static String doubleColumnarTransposition() {

        return "ddd";
    }

    public static String rowTranspositionCiphers() {

        return "ddd";
    }

    public static String nihilistTranspositionCiphers() {

        return "ddd";
    }
}
