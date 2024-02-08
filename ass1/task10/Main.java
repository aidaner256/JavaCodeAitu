import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("ENTER")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println(sum);
    }
}
