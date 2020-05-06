/**
 * inputs :
 * int[] a = { 100, 64, 36, 2 };
		int[] b = { 1, 9, 36, 49, 81 };
		
		output :
		
		[1, 2, 9, 36, 36, 49, 64, 81, 100]
		
 */
package com.codecreeks.solutions;

import java.util.Arrays;

/**
 * @author Apple
 *
 */
public class SortingAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = { 100, 64, 36, 2 };
		int[] b = { 1, 9, 36, 49, 81 };

		SortingAlgorithm algo = new SortingAlgorithm();
		int[] output = algo.sort(a, b);
		System.out.println(Arrays.toString(output));

	}

	private int[] sort(int[] a, int[] b) {
		int bLen = b.length;
		int aLen = a.length;
		int len = aLen + bLen;
		int aPtr = aLen - 1;
		int bPtr = 0;

		int[] output = new int[len];

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

		return output;
	}

}
