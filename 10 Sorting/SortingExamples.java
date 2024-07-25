package com.dsa.Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExamples {

	// Bubble sort sorts using number of iterations
	// Find the highest and push it to last
	// Running from left to right
	// ON EVERY ITERATION THE LAST ARRAY ELEMENT IS LEFT

	static void bubblesortPractice(int[] testarray) {
		int temvalue = 0;
		for (int i = 0; i < testarray.length; i++) {
			for (int j = 1; j < testarray.length - i; j++) {
				if (testarray[j - 1] > testarray[j]) {

					temvalue = testarray[j - 1];
					testarray[j - 1] = testarray[j];
					testarray[j] = temvalue;
				}
			}
		}
	}

	static void bubbleSort(int[] arr) { // successive continuous swaps
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n/* arr.length */; i++) {
			for (int j = 1; j < (n/* arr.length */ - i); j++) { // COMPARING J FROM ELEMENT NEXT TO I TO LAST -I ELEMENT
																// SWAP AND PUT THE HIGHEST ELEMENT AT LAST
				// System.out.println(n-i);
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

					System.out.println(Arrays.toString(arr));
				}
			}
			// System.out.println(Arrays.toString(arr));
		}

	}

	static void bubbleSort1(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n/* arr.length */; i++) {
			for (int j = n - 1; j > i; j--) { // COMPARING J FROM LAST ELEMENT TO ELEMENT NEXT TO I
												// SWAP AND PUT THE LOWEST ELEMENT AT FIRST
				// ANOTHER WAY TO INCREASE HEAD
				//
				// System.out.println(n-i);
				if (arr[j] < arr[j - 1]) {
					// swap elements
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

					System.out.println(Arrays.toString(arr));
				}
			}
			// System.out.println(Arrays.toString(arr));
		}

	}

	static void bubbleSortingPrac(int[] arraytobeSorted) {
		int temp = 0;
		for (int i = 0; i < arraytobeSorted.length; i++) {
			for (int j = arraytobeSorted.length - 1; j > i; j--) {
				if (arraytobeSorted[j] > arraytobeSorted[j - 1]) {

					temp = arraytobeSorted[j];
					arraytobeSorted[j] = arraytobeSorted[j - 1];
					arraytobeSorted[j - 1] = temp;
				}
			}
		}
	}

	static void bubblesortRev(int[] arr3) {

		int temp = 0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 1; j < arr3.length - i; j++) {
				if (arr3[j] > arr3[j - 1]) {
					// swap to first
					temp = arr3[j];
					arr3[j] = arr3[j - 1];
					arr3[j - 1] = temp;
				}

			}
			System.out.println("f$#%$#$%#" + Arrays.toString(arr3));

		}
	}

	// IMPROVING BUBBLE SORT
	// ALL ABOUT BUBBLE SORT HERE::::---
	// https://javarevisited.blogspot.com/2014/08/bubble-sort-algorithm-in-java-with.html
	/*
	 * if array is already sorted, our existing bubble sort method is still going to
	 * take n-1 pass, same number of comparison but no exchange. If you observe
	 * carefully, you will find that after one pass through the array, the largest
	 * element will moved to the end of the array, but many other elements also
	 * moved toward their correct positions, as bubbles move toward the water’s
	 * surface. By leveraging this property, you can deduce that during a pass, if
	 * no pair of consecutive entries is out of order, then the array is sorted.
	 */

	public static void bubbleSortImproved(int[] number) {
		boolean swapped = true;
		int last = number.length - 2;
		// only continue if swapping of number has occurred
		while (swapped) {
			swapped = false;
			for (int i = 0; i <= last; i++) {
				if (number[i] > number[i + 1]) {
					// pair is out of order, swap them
					swap(number, i, i + 1);
					swapped = true;
					System.out.println(Arrays.toString(number));
					// swapping occurred
				}
			}
			// after each pass largest element moved to end of array
			last--;
		}
	}

	public static void swap(int[] arrtoswap, int from, int to) {
		int temp = arrtoswap[from];
		arrtoswap[from] = arrtoswap[to];
		arrtoswap[to] = temp;
	}

	// SELECTION SORT
	// FInd/select the smallest number and put it at first position
	// Move the head ahead by one then

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
	
	
	static void selSortPractice(int[] arraya) {
		for (int i = 0; i < arraya.length; i++) {
			int smallindex = i;

			// Comparing all the numbers to first index
			for (int j = i + 1; i < arraya.length; j++) {
				if (arraya[j] < arraya[smallindex]) { // Comparing all the numbers to first index
					smallindex = j;
				}
			}

			// Performing swap
			// Moving the smallest number to the first position / position of i
			int smallestNum = arraya[smallindex];
			arraya[smallindex] = arraya[i];
			arraya[i] = smallestNum;
		}
	}

	static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	// Insertion sort
	// Bubble sorts the list and increments the head by one
	// Also sorts the left side elements of the head(sorted list)

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
			printArray(arr);
			arr[j + 1] = key;
			System.out.println("Swapping Elements: New Array After Swap");

			printArray(arr);

		}
	}

	
	public static void insertionS(int[] arr) {
	for(int i =1;i<arr.length;i++ ) {
		int j =i-1;
		while(j>-1 && arr[j] > arr[i]) {
			arr[j+1] = arr[j];
			j--;
		}
	}
	}
	
	
	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) { // 2nd NUMBER OF THE ARRAY
			System.out.println("Sort Pass Number : " + (i));
			int key = arr[i]; // i is right hand value
			int j = i - 1;
			while (j > -1 && arr[j] > key) { // j is left side value
				System.out.println("Comparing " + key + " and " + arr[j]);
				arr[j + 1] = arr[j];
				printArray(arr);

				j--;

				// KEEPS ON REDUCING J UNTIL
				// YOU REACH A POSITION
				// WHEN arr[j] is not > Key
				// KEEP ON SHIFTING BIGGER INTS TO RIGHT
			}

			// put this key which was lower at new j location
			arr[j + 1] = key;
			System.out.println("Swapping Elements: New Array After Swap");

			printArray(arr);

		}
	}

	/* function to sort arr using shellSort */
//SHELL SORT
//Compare all elements present at a gap and then move the highest element at j value
//Keep moving the element at j value
//assign the
//at right side 

	public static void ShellSortPrac(int[] arr) {
		int n = arr.length;
		for (int gap = n / 2; gap > 0; gap = gap / 2) {
			System.out.println("Pass with gap" + gap);
			for (int i = gap; i < n; i++) {
				int temp = arr[i];
				int j;
				System.out.println(temp);
				System.out.println(arr[i - gap]);
				// arr[j-gap] is the previous element with arr[j](or arr[i]) - gap

				// here when gap =1 it acts are insertion sort
				for (j = i; j >= gap && arr[j - gap] > temp; j = j - gap) {

					arr[j] = arr[j - gap];
					System.out.println("Replaced right lower number by higner number in gap places");
					printArray(arr);
				}
				// J is nor the Leftest number in the gap order
				arr[j] = temp;
				System.out.println("Shifted leftest number in the gap by temp");
				printArray(arr);

			}

		}

	}
	
	
//REMOVE DUPLICATES FROM AN ARRAY
//How to Remove duplicates from an Array
	public static int[] removeDuplicates(int[] arrayWithDuplicates) {
		Arrays.sort(arrayWithDuplicates);
		int[] removedDupsArray = new int[arrayWithDuplicates.length];

		// int previous = arrayWithDuplicates[0];

		removedDupsArray[0] = arrayWithDuplicates[0];
		int duplicateCounter = 0;
		int j = 1;
		for (int i = 1; i < arrayWithDuplicates.length; i++) {

			int ch = arrayWithDuplicates[i]; // right side
			if (ch != arrayWithDuplicates[i - 1]) { // left side

				removedDupsArray[j] = ch;
				j++;

			} else {
				// COUNT THE NUMBER OF DUPLICATES
				// STORE IN FDUPLICATE COUNTER
				duplicateCounter++;
			}

			///////////////////////////////
			/*
			 * else{ //REDUCE THE SIZE OF THE ARRAY //CANNOT REDUCE THE SIZE OF ORIGINALLY
			 * DEFINED ARRAY } }
			 */

		}

		removedDupsArray = Arrays.copyOf(removedDupsArray, removedDupsArray.length - duplicateCounter);
		return removedDupsArray;

	}

	public static int[] removeDuplicatesCopied(int[] arrayWithDuplicates) {
		Arrays.sort(arrayWithDuplicates);
		int[] removedDupsArray = new int[arrayWithDuplicates.length];

		int previous = arrayWithDuplicates[0];
		removedDupsArray[0] = previous;

		for (int i = 1; i < arrayWithDuplicates.length; i++) {
			int ch = arrayWithDuplicates[i];

			if (previous != ch) {
				removedDupsArray[i] = ch;
			}

			previous = ch;

		}
		return removedDupsArray;

	}

	public static int reverseInteger(int originalNo) {

		int reversedNo = 0;
		int digit;
		while (originalNo != 0) {
			digit = originalNo % 10;
			reversedNo = reversedNo * 10 + digit;
			originalNo = originalNo / 10;
		}

		return reversedNo;
	}

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 8, 2, 45, 320, 5, 7 };
		// bubblesortPractice(arr);
		// insertionSort(arr);
		//ShellSort(arr);
		insertionSort(arr);
		/*
		 * quickSort(arr, 0, arr.length-1); System.out.println(Arrays.toString(arr));
		 * 
		 * 
		 * System.out.println("--------------------------");
		 * 
		 * System.out.println(reverseInteger(12345678));
		 * 
		 * 
		 * 
		 * 
		 * //BUBBLE SORT int arrWithDups[] ={3,60,35,8, 2,45,320,5, 5,7,8};
		 * System.out.println("Removed duplicates from the array \"ARR\""+Arrays.
		 * toString(removeDuplicates(arrWithDups))); //
		 * System.out.println("Removed duplicates from the array \"ARR\""+Arrays.
		 * toString(removeDuplicatesCopied(arrWithDups)));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Improved Array Before Bubble Sort"); for(int i=0; i <
		 * arr.length; i++){ System.out.print(arr[i] + " "); } System.out.println();
		 * 
		 * bubbleSortingPrac(arr); //bubblesortPractice(arr);//sorting array elements
		 * using bubble sort
		 * 
		 * //bubbleSortImproved(arr);
		 * 
		 * System.out.println("Improved Array After Bubble Sort"); for(int i=0; i <
		 * arr.length; i++){ System.out.print(arr[i] + " "); }
		 * 
		 * 
		 * //Here MAP to Object is used String result = Arrays.stream(arr)
		 * .mapToObj(String::valueOf) .collect(Collectors.joining(","));
		 * System.out.println("\n"+result);
		 * 
		 * 
		 * //USING STRING BUILDER //Collecting the intstream to a String using
		 * StringBuilder String result2 = Arrays.stream(arr) //IntStream
		 * .collect(StringBuilder::new, // supplier StringBuilder::appendCodePoint, //
		 * accumulator StringBuilder::append) // combiner .toString();
		 * System.out.println("\n"+result);
		 * 
		 * 
		 * 
		 * 
		 * /*int[] intArray = { 1, 2, 3, 4, 5 }; String strArray[] =
		 * Arrays.stream(intArray) .mapToObj(String::valueOf) .toArray(String[]::new);
		 */

		/*
		 * List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 * List<Integer> listOfIntegers = listOfStrings.stream() .map(Integer::valueOf)
		 * .collect(Collectors.toList());
		 */

		/*
		 * // Convert IntStream to String String input = "Techie Delight"; String string
		 * = input.codePoints() // IntStream .collect(StringBuilder::new, // supplier
		 * StringBuilder::appendCodePoint, // accumulator StringBuilder::append) //
		 * combiner .toString();
		 * 
		 * System.out.println(string);
		 * 
		 * 
		 * 
		 * //SELECTION SORT int[] arr1 = {9,14,3,2,43,11,58,22};
		 * bubblesortPractice(arr1);
		 * System.out.println("Bubbsortprac"+Arrays.toString(arr1));
		 * 
		 * int[] arr3 = {109,142,3,2,43,11,158,22};
		 * System.out.println("BubbsortRev"+Arrays.toString(arr3)); bubblesortRev(arr3);
		 * System.out.println("BubbsortRev"+Arrays.toString(arr3));
		 * 
		 * 
		 * 
		 * int[] arr4 = {3,21,1,91,11,9,32,22};
		 * System.out.println("Before Selection Sort");
		 * 
		 * 
		 * 
		 * for(int i:arr4){ System.out.print(i+" "); } System.out.println();
		 * 
		 * selectionSort(arr4);//sorting array using selection sort
		 * 
		 * System.out.println("After Selection Sort"); for(int i:arr4){
		 * System.out.print(i+" "); }
		 * 
		 * int[] arr5 = {3,21,1,91,11,9,32,22};
		 * 
		 * System.out.println("\n Insertion sort"); printArray(arr5);
		 * 
		 * ShellSortPrac(arr5); insertionSort(arr5);
		 * 
		 */
	}
}
