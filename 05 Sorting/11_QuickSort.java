package com.dsa.Sorting;

/*
1. Pick a pivot and place it in its correct place in a sorted array.
2. Smaller on the left, larger on the right
*/


public class QuickSort {

	/*
	Step 1 − Make the right-most OR middle index value pivot
	Step 2 − partition the array using pivot value
	Step 3 − quicksort left partition recursively
	Step 4 − quicksort right partition recursively
	*/

	// QUICK SORT
	public static void quickSort(int[] arr, int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		//1 Step
		// calculate pivot number
		// pivot as middle number of array
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays

		while (i <= j) {
			/* 2 Step
			 * In each iteration, we will identify a number from left side which is greater
			 * then the pivot value, and also we will identify a number from right side
			 * which is less then the pivot value. Once the search is done, then we exchange
			 * both numbers.
			 */

			//^^3 Step
			// If the current value from the left list is smaller than the pivot
			// element then get the next element from the left list
			while (arr[i] < pivot) {
				i++;
			} // will break when left list value is greater then pivot

			// If the current value from the right list is larger than the pivot
			// element then get the next element from the right list
			while (arr[j] > pivot) {
				j--;
			} // will break when right list value is less then pivot

			// If we have found a value in the left list which is larger than
			// the pivot element and if we have found a value in the right list
			// which is smaller than the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			// if still i is less then or equal to j (meaning i hasnt incremented to j or j
			// hasnt decremented to i)

			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}

			//** Step 5
			// call quickSort() method recursively
			if (lowerIndex < j) //current reduced j
				quickSort(arr, lowerIndex, j);
			if (i < higherIndex) //current increased i
				quickSort(arr, i, higherIndex);
		}
		

	}
	
	public static void swap(int[] arrtoswap, int from, int to) {
		int temp = arrtoswap[from];
		arrtoswap[from] = arrtoswap[to];
		arrtoswap[to] = temp;
	}

}

public class QuickSortTest {
	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 8, 2, 45, 320, 5, 7 };
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

