package com.dsa.Sorting;

import java.util.Arrays;

public class ShellSort {

	/*
	Algorithm
	Step 1 − Initialize the value of h
	Step 2 − Divide the list into smaller sub-list of equal interval h
	Step 3 − Sort these sub-lists using insertion sort
	Step 3 − Repeat until complete list is sorted
	*/
	
	
	public static void ShellSort(int[] arr) {
		int n = arr.length;
		System.out.println("Original array" + Arrays.toString(arr));
		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {
			System.out.println("Pass with gap  : " + gap);
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted

			for (int i = gap; i < n; i++) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				System.out.println("I value is " + i);
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					System.out.println("J value :" + j);
					
					// Keep on shifting highest values
					// to arr[j]
					arr[j] = arr[j - gap];
				}

				// put temp (the original a[i]) in its correct
				// location
				// System.out.println("Ärrrrrr J value after loop" + j );
				arr[j] = temp;

				System.out.println(Arrays.toString(arr));
			}
		}
	}

	

}
