import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        // Create a Scanner object for inputting data from the console
        Scanner scanner = new Scanner(System.in);

        // Getting the array size from the user
        int size = scanner.nextInt();

        // Create an array of integers with the size specified by the user
        int[] myArr = new int[size];

        // Filling the array with the values entered by the user
        for (int i = 0; i < size; i++) {
            myArr[i] = scanner.nextInt();
        }

        // Search for the maximum value in the array
        int max = 0;
        for (int i = 0; i < size; i++) {
            // If the current element of the array is larger than the current maximal value
            if (myArr[i] > max) {
                // Update the maximum value
                max = myArr[i];
            }
        }

        // Output the maximum value to the screen
        System.out.println(max);
    }
}