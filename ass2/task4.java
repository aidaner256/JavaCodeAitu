import java.util.Scanner;

public class task4 {
    // Declare two arrays of integers of size 10
    public static int[] firstArray = new int[10];
    public static int[] secondArray = new int[10];

    public static void main(String[] args) {
        // Initialization of elements of two arrays by a nested loop
        for (int i = 0; i < 2; i++) {
            for (int o = 0; o < 10; o++) {
                // Filling the first array with values from 0 to 9 at i = 0
                if (i == 0) {
                    firstArray[o] = o;
                // Filling the second array with values from 0 to 9 at i = 1
                } else {
                    secondArray[o] = o;
                }
            }
        }

        // Calculate the total length of the merged array
        int lenOut = firstArray.length + secondArray.length;
        // Creating a new array to merge two initial arrays
        int[] outArray = new int[lenOut];
        
        // Variable counter to track the current index of the second array (secondArray)
        int counter = 0;
        // Copying elements from the first and second arrays into the merged array
        for (int i = 0; i < outArray.length; i++) {
            // If the current index i is within the length of the first array (firstArray)
            if (i < firstArray.length) {
                // Copying an element from the first array to the corresponding cell of the merged array (outArray)
                outArray[i] = firstArray[i];
            } else {
                // If the current index i is outside the length of the first array,
                // copy an element from the second array (secondArray) into the merged array (outArray)
                outArray[i] = secondArray[counter++];
            }
        }

        // Output the combined array to the screen
        for (int i = 0; i < lenOut; i++) {
            System.out.println(outArray[i]);
        }
    }
}