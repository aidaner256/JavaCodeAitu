public class task7 {
    public static void main(String[] args) {
        // Create a two-dimensional array with variable length of strings
        int[][] array = new int[10][];

        // Initialization of each line of the array with increasing length
        for (int i = 0; i < 10; i++) {
            array[i] = new int[i + 1];
        }

        // Filling the array with values
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Assigning the value to the array cell as the sum of row and column indices
                array[i][j] = i + j;
            }
        }

        // Display the array on the screen
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Print an array element with a space after the value
                System.out.print(array[i][j] + " ");
            }
            // Switch to a new line after the array string output is complete
            System.out.println();
        }
    }
}