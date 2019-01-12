/**
 *  How to implement Bubble sort algorithm
 */
package com.cfed.algorithms;

/**
 * @author Konzern
 * 
 * The complexity is n square
 *
 */
public class BubbleSortAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 1 };

		int len = arr.length;

		for (int j = 0; j < len - 1; j++) {

			for (int i = 0; i < len - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
