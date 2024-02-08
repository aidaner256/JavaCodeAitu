import java.util.Scanner;

public class task2 {
    // Declare an array of strings arrStr with size 5
    public static String[] arrStr = new String[5];

    public static void main(String[] args) {
        // Fill the array of strings arrStr depending on the index
        for (int i = 0; i < 5; i++) {
            // If the index is even, assign "Even", if not "Odd"
            if (i % 2 == 0) {
                arrStr[i] = "Even";
            } else {
                arrStr[i] = "Odd";
            }
        }

        // Output the contents of the arrStr array
        for (int i = 0; i < 5; i++) {
            System.out.println(arrStr[i]);
        }
    }
}