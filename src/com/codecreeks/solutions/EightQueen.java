/**
 * Trying to solve eight queen problem in a chess board
 */
package com.codecreeks.solutions;

/**
 * @author Consumerfed kozhikode IT Section
 *
 */
public class EightQueen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] output = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0 } };

		int x = 0;
		int y = 0;
		int queen = 1;
		int queenCount = 8;

		while (queen <= queenCount) {
			output[x][y] = 1;
			x = x + 1;
			y = y + 2;
			if (y >= 8) {
				y = (y % 8) + 1;
			}
			queen++;
		}

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				System.out.print(output[row][col] + " ");
			}
			System.out.println();
		}

	}

}
