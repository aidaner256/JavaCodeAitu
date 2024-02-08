import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            for (int i = 135; i > 0; i--) {
                int spaces = (135 - i) / 2;
                for (int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }
                for (int g = i; g > 0; g--) {
                    System.out.print("8");
                }
                System.out.println("");
            }
        }
    }˜
}
