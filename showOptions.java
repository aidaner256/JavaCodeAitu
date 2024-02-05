public static void showOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your name:");
            String name_usr = scanner.nextString();
            System.out.println("Your Branch:");
            String Branch_usr = scanner.nextString();
            System.out.println("Options:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Deposit Funds");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Branch_usr.findDepositor(name_usr);
                    break;
                case 2:
                    System.out.println("Withdrawal amount:");
                    int amountToWithdraw1 = scanner.nextInt();
                    Branch_usr.removeContribution(name_usr, amountToWithdraw1)
                    break;
                case 3:
                    System.out.println("Deposit amount:");
                    int amountToDeposit1 = scanner.nextInt();
                    Branch_usr.addContribution(name_usr, amountToDeposit1)
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }