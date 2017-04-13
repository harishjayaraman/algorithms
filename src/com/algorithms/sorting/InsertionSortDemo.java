package com.algorithms.sorting;


/**
 *Demo class for Insertion Sort Algorithm 
 * 
 **/
public class InsertionSortDemo {

	public static void main(String... strings) {
		int[] input = { 3, 7, 8, 6, 4, 16, 1 };
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(input);
	}
}
