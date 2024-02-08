import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double highTemp = 37.5;
        double lowTemp = 35.5;
        double temp = scanner.nextDouble();
        boolean isHigh = temp >= highTemp;
        boolean isLow = temp <= lowTemp;
        if (isHigh) {
            System.out.println("High");
        } else if (isLow) {
            System.out.println("Low");
        } else {
            System.out.println("Normal");
        }
    }
}
