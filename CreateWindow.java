import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWindow {
    private static JTextArea outputArea;
    private static JTextField searchField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BANK");

        JPanel panel = new JPanel();

        outputArea = new JTextArea(30, 50);
        outputArea.setEditable(false);  // Prevent user editing

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton button1 = new JButton("button1");  // More descriptive labels
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button3");
        JButton button4 = new JButton("Exit");
        searchField = new JTextField(20);  // Initialize here
        JButton searchButton = new JButton("Search");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.append("Balance checked\n");  // Replace with actual balance logic
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.append("Funds withdrawn\n");  // Replace with withdrawal logic
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.append("Funds deposited\n");  // Replace with deposit logic
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Proper exit method
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                // Perform the search logic here using the searchText
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(searchField);
        panel.add(searchButton);
        panel.add(scrollPane);
        frame.getContentPane().add(panel);
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        StartMsg();
    }

    public static void StartMsg() {
        outputArea.append("Welcome to the BANK application!\n");
        outputArea.append("Enter your name pls\n");
        outputArea.append("Available options:\n");
        outputArea.append("1. Check Balance\n");
        outputArea.append("2. Withdraw Funds\n");
        outputArea.append("3. Deposit Funds\n");
        outputArea.append("4. Exit\n");
    }
}
