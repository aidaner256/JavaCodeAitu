import java.util.Scanner;

public class task8 {
    public static void main (String[] args) {
        // Create a Scanner object for inputting data from the console
        Scanner scanner = new Scanner(System.in);

        // Getting the number of lines from the user
        int num = scanner.nextInt();

        // Creating a two-dimensional array with variable length of rows
        int[][] array = new int[num][];

        // Array for storing array string lengths
        int[] lenstr = new int[99]; // It is assumed that the string length will not exceed 99 elements

        // Initialization of each string of the array array with increasing length
        for (int i = 0; i < num; i++) {
            array[i] = new int[scanner.nextInt()];
        }

        // Output the array to the screen 
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Output an array element with a space after the value
                System.out.print(array[i][j] + " ");
            }
            // Switch to a new line after the array string output is complete
            System.out.println("");
        }
    }
}
