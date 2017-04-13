package com.algorithms.sorting;

/**
 * 
 *  
 **/
public class InsertionSort {
	

	// Sort the given integer array and print the value of the sorted array
	public void sort(int[] input) {

		int length = input.length;

		for (int i = 0; i < length; i++) {

			int currentValue = input[i];
			int j = i - 1;
			
			while(j >=0 && (input[j] > currentValue)){
				
				input[j+1] = input[j];
				j = j-1;
			}
			
			input[j+1] = currentValue;
		}
		
		
		for(int i=0; i< length; i++){
			System.out.print(input[i]+ " ");
		}

	}

}
