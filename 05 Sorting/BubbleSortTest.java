package com.dsa.Sorting;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 8, 2, 45, 320, 5, 7 };
		System.out.println("Original array "+ Arrays.toString(arr));
		BubbleSort.bubbleSort(arr);
	}
}
