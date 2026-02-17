// Bubble sort in Java
//Run i till size-1, run j till size-1-i,skip the last element
//Striver explanation for swapped logic
// https://www.programiz.com/dsa/bubble-sort
// https://www.geeksforgeeks.org/dsa/bubble-sort-algorithm/

import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    boolean swapped;
    
    // loop to access each array element
    for (int i = 0; i < size - 1; i++) {
    
      // loop to compare array elements
      for (int j = 0; j < size - i - 1; j++) {

        // compare two adjacent elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }

      // If no two elements were swapped by inner loop, then break
      if(swapped == false) {
        break;
      }
      
    }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // call method using class name
    Main.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
