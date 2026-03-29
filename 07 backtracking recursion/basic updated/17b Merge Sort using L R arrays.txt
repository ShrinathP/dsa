package com.dsa.Sorting;

import java.util.Arrays;

public class MergeSort {

	
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
	
		//**1 WRITING THE SORT FUNCTION
	void sort(int arr[], int l, int r) {

		if(l< r) {
			//Finding the middle point
			int m = (l+r)/2;
			
			//left sort
			sort(arr, l, m);
			//right sort
			sort(arr, m+1, r);
			
			//Merge the sorted halves
			merge(arr, l , m , r);
		}
	
	}
	
	
	//***2 WRITING THE MERGE FUNCTION
	//merges 2 subarrays of arr[]
	//First subarray is arr[l...m]
	//second subarray is arr[m+1...r]
	private void merge(int[] arr, int l, int m, int r) {
	
		//1 Step
		//Find the sizes of the 2 subarrays to be merged
		int n1 = m-l+1;
		int n2 = r-m;
		
		//2 Step
		/*Create temp arrays*/ 
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		//3 Step
		/*Copy data into the temp arrays*/
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = arr[m+1+j];
		}
		
		
		//4 Step
		/* Merge this temp arrays*/
		// Initial indexes of the first 2 subarrays
		int i=0, j = 0;
		
		// Initial index of the merged subarray
		int k=l; //Start filling arr from k = l
		while(i < n1 && j <n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		/* Copy remaining elements of L[] if any */
        //if size of n1 is greater than n2 some elements will remain uncopied
		while(i < n1) {
			arr[k]= L[i];
			i++;
			k++;
		}
  
        /* Copy remaining elements of R[] if any */
		//if size of n2 is greater than n1 some elements will remain uncopied
        while (j < n2) { 
            arr[k]= R[j]; 
            j++;
            k++;
        }
        
        System.out.println("Array State after merge" + Arrays.toString(arr));
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
