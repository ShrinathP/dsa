package com.dsa.Sorting;

import java.util.Arrays;

public class BubbleSort {
//IMP Arrays.sort uses Quicksort for primitives , but Array.sort and Collections.sort uses TimeSort a version of MergeSort 
//for sorting Objects
	
	
	// Bubble sort sorts using number of iterations
	//2 FOR LOOPS
	//1.  Find the highest and push it to last
	//2.  Running from left to right
	//3.  ON EVERY ITERATION THE LAST ARRAY ELEMENT IS LEFT

	
	static void bubbleSort(int[] arr) { // successive continuous swaps
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n/* arr.length */; i++) {
			for (int j = 1; j < (n/* arr.length */ - i); j++) { // COMPARING J FROM ELEMENT NEXT TO I TO LAST -I ELEMENT
																// SWAP AND PUT THE HIGHEST ELEMENT AT LAST
				// System.out.println(n-i);
				if (arr[j - 1] > arr[j]) {
					//swap elements //shift right
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

					//System.out.println(Arrays.toString(arr));
				}
			}
			// System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
