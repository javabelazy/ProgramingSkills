/**
 * Find the possible combinations of max and min number in a given array by removing the duplicates
 * 
 * Thanks to sreejith
 */
package com.cfed.logicz;

import java.util.Arrays;

/**
 * @author cfed
 *
 */
public class ArrayCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ar[] = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3,
				1, 1, 1, 1, 1, 5, 5, 5, 5, 3, 3, 3 };
		int arraySize = ar.length;
		Arrays.sort(ar);
		System.out.println(ar[0]);
		int duplicateCount = 0;
		for (int i = 1; i < arraySize; i++) {
			if (ar[i - 1] == ar[i]) {
				duplicateCount = duplicateCount + 1;
			}
		}
		int actualSize = arraySize - duplicateCount;
		int output =(actualSize * (actualSize -1))/2;
		System.out.println(output);
	}



}
