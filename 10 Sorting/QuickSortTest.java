package com.dsa.Sorting;

import java.util.Arrays;

public class QuickSortTest {

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 8, 2, 45, 320, 5, 7 };
		QuickSort.quickSort(arr, 0, arr.length-1); 
		System.out.println(Arrays.toString(arr));
	}
}