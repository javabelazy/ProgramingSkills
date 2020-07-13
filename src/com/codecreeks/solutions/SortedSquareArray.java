/**
 * input : { -10, -8, -3, -1, 4, 6, 8 };
 * output : [ 1, 9, 16, 36, 64, 64, 100]
 */
package com.codecreeks.solutions;

import java.util.Arrays;

/**
 * @author Apple
 *
 */
public class SortedSquareArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { -10, -8, -3, -1, 4, 6, 8 };
		int len = input.length;
		int[] output = new int[len];
		int pstn = 0;
		for (int i = 0; i < len; i++) {
			int square = input[i] * input[i];

			if (i > 0 && square >= output[i - 1]) {
				output[i] = square;
			} else {
				if (i > 2)
					pstn = i - 2;
				for (int j = pstn; j >= 0; j--) {
					if (output[j] > square) {
						insert(j+1,output,square);
						pstn = j;
						break;
					}
				}

			}

		}
		
		System.out.println(Arrays.toString(output));

	}

	private static void insert(int position, int[] array, int value) {
		// TODO Auto-generated method stub
		
		
	}

}
