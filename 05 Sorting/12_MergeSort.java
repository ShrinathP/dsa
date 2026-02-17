//Striver Explanation

	
	//Merge Sort is divide and conquer algorithm
	//it is a recursive algorithm
	
	/*
	MergeSort(arr[], l,  r)
	If r > l
	     1. Find the middle point to divide the array into two halves:  
	             middle m = (l+r)/2
	     2. Call mergeSort for first half:   
	             Call mergeSort(arr, l, m)
	     3. Call mergeSort for second half:
	             Call mergeSort(arr, m+1, r)
	     4. Merge the two halves sorted in step 2 and 3:
	             Call merge(arr, l, m, r)
	             
	*/

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;   // Base case: 1 element

        int mid = left + (right - left) / 2;

        // 1️⃣ Sort left half
        mergeSort(arr, left, mid);

        // 2️⃣ Sort right half
        mergeSort(arr, mid + 1, right);

        // 3️⃣ Merge sorted halves
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge temp arrays back into original
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 6};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
