/**
 * 
 */
package com.codecreeks.solutions;

import java.util.Arrays;

/**
 * @author Apple
 *
 */
public class SquareSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { -10, -8, -3, -1, 4, 6, 8 };
		int len = input.length;
		int[] asc = new int[len];
		int[] dsc = new int[len];
		int[] output = new int[len];

		int dPstn = 0;
		int aPstn = 0;

		for (int i = 0; i < len; i++) {
			int value = input[i];
			int square = value * value;
			if (value < 0) {
				dsc[dPstn] = square;
				dPstn++;
			} else {
				asc[aPstn] = square;
				aPstn++;
			}
		}

//		len = (aPstn>dPstn) ? aPstn : dPstn;

		System.out.println(Arrays.toString(asc));

		System.out.println(Arrays.toString(dsc));

		int bLen = dPstn;
		int aLen = aPstn;
		int aPtr = aLen - 1;
		int bPtr = 0;


		for (int i = 0; i < len; i++) {

			if (bPtr > (bLen - 1)) {
				while (aPtr >= 0) {
					output[i] = dsc[aPtr];
					i++;
					aPtr--;
				}
				break;
			}

			if (aPtr < 0) {
				while (bPtr < bLen) {
					output[i] = dsc[bPtr];
					i++;
					bPtr++;
				}
				break;
			}

			if (asc[bPtr] < dsc[aPtr]) {
				output[i] = asc[bPtr];
				bPtr++;
			} else {
				output[i] = dsc[aPtr];
				aPtr--;
			}

		}

	
		
		System.out.println(Arrays.toString(output));

	}

}
