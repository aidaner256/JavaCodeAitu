import java.util.Scanner;

public class  showOptions1{
    public static void showOptions(Deposit branch_usr) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your name:");
            String name_usr = scanner.next();
            System.out.println("Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    branch_usr.findDepositor(name_usr);
                    break;
                case 2:
                    System.out.println("Withdrawal amount:");
                    int amountToWithdraw1 = scanner.nextInt();
                    branch_usr.removeDepositor(name_usr, amountToWithdraw1); 
                    break;
                case 3:
                    System.out.println("Deposit amount:");
                    int amountToDeposit1 = scanner.nextInt();
                    branch_usr.addDepositor(name_usr, amountToDeposit1);
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
