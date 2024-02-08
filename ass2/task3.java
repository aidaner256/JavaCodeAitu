import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Create an array arrInt of 10 integers
        int[] arrInt = new int[10];

        // Fill the arrInt array with values from 0 to 9, so that we don't have to do it manually.
        for (int i = 0; i < 10; i++) {
            arrInt[i] = i;
        }

        // Change the sign of array elements with even indices
        for (int i = 0; i < 10; i++) {
            if (arrInt[i] % 2 == 0) {
                arrInt[i] = arrInt[i] * (-1);
            }
        }

        // Output the contents of the arrInt array
        for (int i = 0; i < 10; i++) {
            System.out.println(arrInt[i]);
        }
    }
}