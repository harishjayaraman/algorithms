package com.algorithms.sorting;


/**
 * Selection sort is one of the n^2 algorithm
 * 
 * How does the selection sort works
 * 
 * Iterate through the given array find the smallest element and swap it to the
 * left most index
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
				if(input[j] < input[minIndex]){
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
