import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name = scanner.nextLine();
        if (18 <= age && age <= 28) {
                System.out.println(name + ", come to the military registration and enlistment office.");
        }
    }
}
