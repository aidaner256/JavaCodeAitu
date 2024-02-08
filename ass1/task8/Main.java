import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highAge = 60;
        int lowAge = 20;
        int temp = scanner.nextInt();
        boolean isHigh = temp >= highAge;
        boolean isLow = temp <= lowAge;
        if (isHigh || isLow) {
            System.out.println("you don’t have to work");
        } else {
            System.out.println("you have to work");
        }
    }
}
