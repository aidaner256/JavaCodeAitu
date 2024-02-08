import java.util.Scanner;

// Class represents an ATM with basic functionality
public class Task15 {

    // Private fields for account ID and balance
    private int id;
    private int balance;

    // Static 2D array to store user data (ID, balance) for multiple accounts
    public static int[][] userdata = new int[2][2];

    // Constructor to initialize an ATM object with ID and balance
    public Task15(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    // Main method to start the ATM program
    public static void main(String[] args) {

        // Initialize sample user data
        userdata[0][0] = 123;
        userdata[0][1] = 1000;
        userdata[1][0] = 321;
        userdata[1][1] = 100;

        // Prompt for user ID input
        System.out.println("Input your id:");
        Scanner scanner = new Scanner(System.in);
        int inputID = scanner.nextInt();

        // Validate user ID
        boolean validID = false;
        for (int i = 0; i < 2; i++) {
            if (userdata[i][0] == inputID) {
                validID = true;
                Task15 atm = new Task15(userdata[i][0], userdata[i][1]); // Create ATM object with valid ID and balance
                showOptions(atm); // Show menu options
                break;
            }
        }

        // If ID is invalid, display error message
        if (!validID) {
            System.out.println("Invalid ID");
        }
    }

    // Method to display ATM menu options and handle user choices
    public static void showOptions(Task15 atm) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + atm.balance);
                    break;
                case 2:
                    System.out.println("Withdrawal amount:");
                    int amountToWithdraw = scanner.nextInt();
                    if (amountToWithdraw > 0 && amountToWithdraw <= atm.balance) {
                        atm.balance -= amountToWithdraw;
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;
                case 3:
                    System.out.println("Deposit amount:");
                    int amountToDeposit = scanner.nextInt();
                    if (amountToDeposit > 0) {
                        atm.balance += amountToDeposit;
                        System.out.println("Deposit successful");
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
