import java.util.ArrayList;
import java.util.List;

public class Deposit extends Branch {

    private List<String> depositors;
    private List<Integer> depositedAmounts;

    public Deposit(String branchName) {
        super(branchName, 0);
        this.depositors = new ArrayList<>();
        this.depositedAmounts = new ArrayList<>();
    }

    public void addDepositor(String depositorsName, int amountDeposited) {
        depositors.add(depositorsName);
        depositedAmounts.add(amountDeposited);
        System.out.println("Deposit successful. Amount deposited by " + depositorsName + ": " + amountDeposited);
    }

    public void printDepositors() {
        System.out.println("Depositors of branch " + getBranchName() + ":");
        for (int i = 0; i < depositors.size(); i++) {
            System.out.println(depositors.get(i) + ": " + depositedAmounts.get(i));
        }
    }

    public void findDepositor(String name) {
        for (int i = 0; i < depositors.size(); i++) {
            if (name.equals(depositors.get(i))){
                System.out.println(depositors.get(i) + ": " + depositedAmounts.get(i));
                return;
            }
        }
        System.out.println("User not found");
    }

    public void countDeposits(){
        int temp = 0;
        for (int i = 0; i< depositors.size(); i++){
            temp += depositedAmounts.get(i);
        }
        System.out.println("Amount of deposits with the branch: " + temp);
    }

    public void addContribution(String user, int amount) {
        for (int i = 0; i < depositors.size(); i++) {
            if (user.equals(depositors.get(i))) {
                depositedAmounts.set(i, depositedAmounts.get(i) + amount);
                System.out.println("Success");
                return;
            }
        }
        System.out.println("User not found");
    }

    public void removeContribution(String user, int amount) {
        for (int i = 0; i < depositors.size(); i++) {
            if (user.equals(depositors.get(i))) {
                if (depositedAmounts.get(i) > 0 && amount <= depositedAmounts.get(i)) {
                    depositedAmounts.set(i, depositedAmounts.get(i) - amount);
                    System.out.println("Success");
                    return;
                } else {
                    System.out.println("Invalid sum");
                }
            }
        }
        System.out.println("User not found");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        printDepositors();
    }
}
