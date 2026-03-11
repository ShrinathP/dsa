package com.dsa.Sorting;

import java.util.Arrays;

public class SelectionSort {

	/*
	Algorithm
	Step 1 − Set MIN to location 0
	Step 2 − Search the minimum element in the list
	Step 3 − Swap with value at location MIN
	Step 4 − Increment MIN to point to next element
	Step 5 − Repeat until list is sorted
	*/
	
	// SELECTION SORT
	// FInd/select the smallest number and put it at first position
	// Move the head ahead by one then

	// Pick the minimum from the unsorted part and put it at the front. No consecutive swaps in inner loop
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j; // searching for lowest number and assigning it the index
				}
			}
			// SWAP THE LOWEST NUMBER LATER OUT OF THE LOOP
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;

			System.out.println(Arrays.toString(arr));
		}
	}	
}




public class SelectionSortTest {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 8, 2, 45, 320, 5, 7 };
		SelectionSort.selectionSort(arr);
	}
}
