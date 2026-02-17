//
// In an expanding window take the last element and put it in its correct position using consecutive swapping from back

package com.dsa.Sorting;

import java.util.Arrays;

public class InsertionSort {
	/*
	Algorithm
	
	To sort an array of size n in ascending order:
	1: Iterate from arr[1] to arr[n] over the array.
	2: Compare the current element (key) to its predecessor.
	3: If the key element is smaller than its predecessor, compare it to the elements before. 
	Move the greater elements one position up to make space for the swapped element.
	
	FOR arr[1] and WHILE loop
	Can use a 2nd for loop instead of while loop also
	*/
	
	
	/*INSERTION SORT VS BUBBLE SORT*/
	/*IMP Difference
	In insertion sort elements are bubbled into the sorted section, 
	while in bubble sort the maximums are bubbled out of the unsorted section.
	
	*https://www.cs.toronto.edu/~jepson/csc148/2007F/notes/sortTimes.jpg
	*/
	
	
	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) { // 2nd NUMBER OF THE ARRAY
			System.out.println("Sort Pass Number : " + (i));
			int key = arr[i]; // i is right hand value
			//1. Current element
			
			//2. Predecessor element
			int j = i - 1;
			
			//3. comparing current elemnt (key) with its predecessor
			//Can use a for loop instead of while
			// for(int j1 = i-1;j1 > -1 && arr[j1] > key; j1--) {}
			
			while (j > -1 && key < arr[j]) { // j is left side value
				//4. if key is less than left side of it, left traverse
				System.out.println("Comparing " + key + " and " + arr[j]);
				//Keep shifting elements to right
				arr[j + 1] = arr[j];
				Arrays.toString(arr);

				j--;

				// KEEPS ON REDUCING J UNTIL
				// YOU REACH A POSITION
				// WHEN arr[j] is not > Key
				// KEEP ON SHIFTING BIGGER INTS TO RIGHT
			}

			// put this key which was lower at new j location
			arr[j + 1] = key;
			System.out.println("Swapping Elements: New Array After Swap");

			Arrays.toString(arr);

		}
	}
	
	//Practice
	public static void inssort(int[] arr1) {
		for(int i =1;i<arr1.length;i++) {
			int key = arr1[i];
			int j =i-1;
			while(j>-1 && key< arr1[j]) {
				arr1[j+1] = arr1[j];
				j--;
			}
			
			arr1[j+1] = key;
		}
	}
	
	
	//Reversing insertion sort

	public static void insertionSortRev(int[] arr) {

		for (int i = 1; i < arr.length; i++) { // 2nd NUMBER OF THE ARRAY
			System.out.println("Sort Pass Number : " + (i));
			int key = arr[i]; // i is right hand value
			int j = i - 1;
			while (j > -1 && arr[j] < key) { // j is left side value
				System.out.println("Comparing " + key + " and " + arr[j]);
				arr[j + 1] = arr[j];
				j--;
			}
			Arrays.toString(arr);
			arr[j + 1] = key;
			System.out.println("Swapping Elements: New Array After Swap");

			Arrays.toString(arr);

		}
	}
}
