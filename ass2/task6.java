public class task6 {
    public static void task6(String[] args) {
        // Create a two-dimensional array of size 10x10
        int[][] table = new int[10][10];

        // Filling the multiplication table with values
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                // Multiplying the row number by the column number and saving the result into a table cell
                table[i - 1][j - 1] = i * j;
            }
        }

        // Output the multiplication table to the screen
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Output a table element with a space after the value
                System.out.print(table[i][j] + " ");
            }
            // Switch to a new line after the table row output is complete
            System.out.println("");
        }
    }
}