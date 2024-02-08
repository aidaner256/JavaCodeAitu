public class task3 {
    public static void main(String[] args) {
        // new arr
        int[] arr = {1, 2, 3, 4, 5, 6};
        // check arr length
        int size = arr.length;
        // call func 
        reverse(arr, size);
    }
    // create func to print
    public static void print(int[] newarr, int size) {
        // loop to print arr
        for (int i = 0; i < size; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    // create func to reverse
    public static void reverse(int[] arr, int size) {
        int[] newarr = new int[size];
        // First loop to iterate through the original array
        for (int i = 0; i < size; i++) {
            // Second loop to reverse the order of elements in the new array
            for (int o = 0; o < size; o++) {
                newarr[o] = arr[size - 1 - o];
            }
        }
        // call func to print 
        print(newarr, size);
    }
}
