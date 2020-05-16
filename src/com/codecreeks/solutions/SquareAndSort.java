/**
 * Squaring and Sorting an input array contains negative and positive number
 * 
 * Complexity O(2n)
 * 
 */
package com.codecreeks.solutions;

import java.util.Arrays;

/**
 * @author Consumerfed Information Technology Section kozhikode
 *
 */
public class SquareAndSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { -10, -8, -3, -1, 4, 6, 8 };
		int len = input.length;
		int[] output = new int[len];

		int[] a = new int[len];
		int[] b = new int[len];

		int aLen = 0;
		int bLen = 0;

		for (int i = 0; i < len; i++) {
			int value = input[i];
			int square = value * value;
			if (value < 0) {
				a[aLen] = square;
				aLen++;
			} else {
				b[bLen] = square;
				bLen++;
			}
		}

	
		int aPtr = aLen-1;
		int bPtr = 0;


		for (int i = 0; i < len; i++) {

			if (bPtr > (bLen - 1)) {
				while (aPtr >= 0) {
					output[i] = a[aPtr];
					i++;
					aPtr--;
				}
				break;
			}

			if (aPtr < 0) {
				while (bPtr < bLen) {
					output[i] = b[bPtr];
					i++;
					bPtr++;
				}
				break;
			}

			if (b[bPtr] < a[aPtr]) {
				output[i] = b[bPtr];
				bPtr++;
			} else {
				output[i] = a[aPtr];
				aPtr--;
			}

		}
		System.out.println("Input : "+Arrays.toString(input));
		System.out.println("Output : "+Arrays.toString(output));
	
	}

}
