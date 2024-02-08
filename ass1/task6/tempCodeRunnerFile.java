import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.nextLine();
        if (age > 0) {
            if (18 <= age && age <= 28) {
                System.out.println(name + ",come to the military registration and enlistment office.");
            } else {
                System.out.println("You are free from military service.");
            }
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}
