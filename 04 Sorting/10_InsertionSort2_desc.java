//move prev to next if its lesser
public class DescendingInsertionSort {

    /**
     * Sorts an array of integers in descending order using the Insertion Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        // Start from the second element (index 1), as the first is a single-element sorted sublist.
        for (int i = 1; i < n; i++) {
            // Store the current element to be inserted into the sorted portion
            int key = arr[i];
            // Start comparing the key with elements in the sorted portion (from right to left)
            int j = i - 1;

            // Move elements of arr[0..i-1], that are smaller than key, to one position ahead
            // of their current position. The condition `arr[j] < key` sorts in descending order.
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j]; // Shift the smaller element to the right
                j = j - 1;           // Move to the next element on the left
            }

            // Place the key in its correct position in the sorted sub-array
            arr[j + 1] = key;
        }
    }

    /**
     * A utility function to print the array elements.
     *
     * @param arr The array to be printed.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method to test the sorting function
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.print("Original array: ");
        printArray(arr);

        insertionSortDescending(arr);

        System.out.print("Sorted array (descending): ");
        printArray(arr);
    }
}
