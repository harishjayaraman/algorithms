package com.algorithms.sorting;

/**
 * Selection sort is one of the n^2 algorithm
 * 
 * Selection Sort Algorithm
 * 
 * 1. Get a list of unsorted numbers 
 * 2. Set a marker for the unsorted section at the front of the list.
 * 3. Repeat steps 4 - 6 until one number remains in the unsorted section 
 * 	
 * 		4. Compare all unsorted numbers in order to select the smallest one 
 * 		5. Swap this number with the first number in the unsorted section
 * 6. Advance the marker to the right one position Stop
 * 
 * */
public class SelectionSort {

	// sort the given input integer array and print the sorted array value
	public void sort(int[] input) {

		int length = input.length;

		for (int i = 0; i < length - 1; i++) {
			// At initial Assume the 0th index is the smallest one.
			int minIndex = i;

			for (int j = i + 1; j < length; j++) {
				if (input[j] < input[minIndex]) {
					minIndex = j;
				}

				int smallNumber = input[minIndex];
				input[minIndex] = input[i];
				input[i] = smallNumber;
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
