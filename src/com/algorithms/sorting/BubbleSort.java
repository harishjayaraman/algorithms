package com.algorithms.sorting;

/**
 * This is another n^2 algorithm
 *
 * https://en.wikipedia.org/wiki/Bubble_sort
 * 
 * Bubble sort is the most basic way to sort a collection. It works by
 * sequentially going through your array and comparing two values at a time,
 * swapping them if necessary. It then repeats the process until no swaps are
 * required.
 * 
 **/
public class BubbleSort {

	/**
	 * Sort the given integer array and print the values of the sorted array
	 **/
	public void sort(int[] input) {

		int length = input.length;

		// The outer loop traverse the array from 0th index to length -1
		for (int i = 0; i < length - 1; i++) {

			// The inner loop traverse the array from 0th index to length -1 -i
			for (int j = 0; j < length - 1 - i; j++) {

				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		
		//Iterate the array and print the value of the sorted array
		for(int i =0; i < length; i++){
			System.out.print(input[i] + " ");
		}

	}

}
