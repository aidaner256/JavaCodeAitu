import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank Kaspi = new Bank("Kaspi");
        Deposit Astana = new Deposit("Astana");
        Astana.printDetails();
        Astana.addDepositor("Aidan", 100);
        Astana.removeContribution("Aidan", 5);
        Astana.findDepositor("Aidan");
        Astana.countDeposits();

            wasdasd
    }
}
