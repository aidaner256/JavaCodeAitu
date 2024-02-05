import java.util.ArrayList;
import java.util.List;

public class Branch extends Bank {
    private String branchName;
    private int deposit;
    private List<String> users;

    public Branch(String branchName, int deposit) {
        super(branchName);
        this.branchName = branchName;
        this.deposit = deposit;
        this.users = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void createBranch(String newBranchName, int initialDeposit) {
        Branch newBranch = new Branch(newBranchName, initialDeposit);
        System.out.println("New branch created: " + newBranchName);
    }

    public void addUser(String user) {
        users.add(user);
    }

    public void printUsers() {
        System.out.println("Users of branch " + branchName + ":");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Branch Name: " + branchName);
        System.out.println("Total deposit amount: " + deposit);
        System.out.println();
    }
}
