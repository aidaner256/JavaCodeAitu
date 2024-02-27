import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateWindow {
    private static JTextArea outputArea;
    private static JTextField searchField;
    private static String nameToSearch;
    private static BalanceManager balanceManager;

    public static void main(String[] args) {
        CreateMain();
    }

    public static void StartMsg() {
        outputArea.append("Welcome to the BANK application!\n");
        outputArea.append("Enter your name, please\n");
        outputArea.append("Available options:\n");
        outputArea.append("1. Withdraw Funds\n");
        outputArea.append("2. Deposit Funds\n");
        outputArea.append("3. Exit\n");
        outputArea.append("To create new user enter data in this way\n");
        outputArea.append("BankName(str) BranchName(str) DepositUser(str) UserName(str) UserID(int) Amount(int)\n");
    }

    public static void ShowInfo(String nameToSearch){
        outputArea.setText("");

        SearchByName searchByName = new SearchByName();

        String amount = searchByName.getAmountByName(nameToSearch);
        outputArea.append("Amount for " + nameToSearch + ": " + amount + "\n");

        String branch = searchByName.getCityByName(nameToSearch);
        outputArea.append("branch for " + nameToSearch + ": " + branch+"\n");

        String city = searchByName.getBranchByName(nameToSearch);
        outputArea.append("City for " + nameToSearch + ": " + city+"\n");

        String id = searchByName.getIdByName(nameToSearch);
        outputArea.append("ID for " + nameToSearch + ": " + id+"\n");

        balanceManager = new BalanceManager(); // Initialize BalanceManager here if needed
    }


    public static void CreateMain() {
        JFrame frame = new JFrame("BANK");

        JPanel panel = new JPanel();

        outputArea = new JTextArea(30, 50);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton button1 = new JButton("Help");
        JButton button2 = new JButton("Withdraw Funds");
        JButton button3 = new JButton("Deposit Funds");
        JButton button4 = new JButton("Exit");
        JButton deleteButton = new JButton("Delete user");
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Log in");
        JTextField userInputField = new JTextField(20);
        JButton createUserButton = new JButton("Create New User");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameToSearch = searchField.getText();
                outputArea.setText("");
                // Assuming you have implemented the SearchByName class correctly
                ShowInfo(nameToSearch);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputArea.setText("");
                StartMsg();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (balanceManager != null) {
                    balanceManager.decreaseBalance(nameToSearch, 100);
                    outputArea.append("Funds withdrawn\n");
                    ShowInfo(nameToSearch);
                } else {
                    outputArea.append("Please log in first\n");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (balanceManager != null) {
                    balanceManager.increaseBalance(nameToSearch, 100);
                    outputArea.append("Funds deposited\n");
                    ShowInfo(nameToSearch);
                } else {
                    outputArea.append("Please log in first\n");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        createUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Здесь вы можете добавить код для создания нового пользователя
                String userInput = userInputField.getText();

                // Разделяем строку по пробелам (или другому разделителю, который вы используете)
                String[] userData = userInput.split("\\s+");

                if (userData.length == 6) { // Проверяем, что введены все 6 значений
                    String bankName = userData[0];
                    String branchName = userData[1];
                    String depositUser = userData[2];
                    String userName = userData[3];
                    int userId = Integer.parseInt(userData[4]);
                    int amount = Integer.parseInt(userData[5]);
                    CreateUser createUser = new CreateUser();
                    createUser.createUser(bankName, branchName, depositUser, userName, userId, amount);
                    outputArea.append("cool");
                } else {
                    // Выводим сообщение об ошибке, если введены не все данные
                    JOptionPane.showMessageDialog(null, "Please enter all required data");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to delete the user?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    // Assuming you have implemented DeleteUser class correctly
                    CreateUser createUser = new CreateUser();
                    createUser.deleteUser(nameToSearch);
                    outputArea.append("User deleted\n");
                }
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
        panel.add(userInputField);
        panel.add(createUserButton);
        panel.add(deleteButton);
        frame.setVisible(true);


        StartMsg();
    }
}
